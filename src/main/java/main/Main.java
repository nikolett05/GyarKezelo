package main;

import java.time.LocalDate;
import java.util.Arrays;

import modell.Gyerekek;
import szolgaltatas.impl.DolgozokSzolgaltatasImpl;
import szolgaltatas.impl.GyarSzolgaltatasImpl;
import tipusok.Beosztasok;
import tipusok.Nemek;
import modell.Dolgozok;
import modell.Gyar;

public class Main {

    public static void main(String[] args) {
        Gyar elsoGyar = new Gyar("Első Gyár", 0);
        Gyar masodikGyar = new Gyar("Második Gyár", 0);

        Gyerekek gyerekek = new Gyerekek("Adél", 8);
        Gyerekek gyerekek1 = new Gyerekek("Mártin", 1);
        Gyerekek gyerekek2 = new Gyerekek("Kincső", 3);
        Gyerekek gyerekek3 = new Gyerekek("Emese", 18);
        Gyerekek gyerekek4 = new Gyerekek("Árpád", 6);
        Gyerekek gyerekek5 = new Gyerekek("Sári", 25);
        Gyerekek gyerekek6 = new Gyerekek("Jocó", 12);
        Gyerekek gyerekek7 = new Gyerekek("Benedek", 7);

        Dolgozok elsoDolgozo = new Dolgozok("Carrie", 34, Beosztasok.ALKALMAZOTT.name(), 140000, Nemek.FÉRFI.name(), LocalDate.of(1968, 8, 31), 0, false, 12);
        Dolgozok masodikDolgozo = new Dolgozok("Samantha", 34, Beosztasok.ALKALMAZOTT.name(), 140000, Nemek.FÉRFI.name(), LocalDate.of(1960, 1, 1), 1, false, 20);
        Dolgozok harmadikDolgozo = new Dolgozok("Miranda", 39, Beosztasok.ALKALMAZOTT.name(), 190000, Nemek.NŐ.name(), LocalDate.of(1977, 6, 3), 3, false, 20);
        Dolgozok negyedikDolgozo = new Dolgozok("Charlotte", 43, Beosztasok.ALKALMAZOTT.name(), 240000, Nemek.NŐ.name(), LocalDate.of(1972, 9, 21), 2, false, 10);
        Dolgozok elsoFonok = new Dolgozok("Mr.Big", 49, Beosztasok.FŐNŐK.name(), 500000, Nemek.FÉRFI.name(), LocalDate.of(1965, 7, 15), 2, false, 18);



        elsoGyar.setDolgozok(Arrays.asList(elsoDolgozo, masodikDolgozo));
        masodikGyar.setDolgozok(Arrays.asList(harmadikDolgozo, negyedikDolgozo, elsoFonok));

        elsoDolgozo.setaDolgozoGyerekei(null);
        masodikDolgozo.setaDolgozoGyerekei(Arrays.asList(gyerekek));
        harmadikDolgozo.setaDolgozoGyerekei(Arrays.asList(gyerekek1,gyerekek2,gyerekek3));
        negyedikDolgozo.setaDolgozoGyerekei(Arrays.asList(gyerekek4,gyerekek5));
        elsoFonok.setaDolgozoGyerekei(Arrays.asList(gyerekek6,gyerekek7));

        GyarSzolgaltatasImpl gyarSzolgaltatas = new GyarSzolgaltatasImpl();
        DolgozokSzolgaltatasImpl dolgozokSzolgaltatas = new DolgozokSzolgaltatasImpl();

        System.out.println("Az első gyárban dolgozók: " + gyarSzolgaltatas.munkasokSzama(elsoGyar));
        System.out.println("Az első gyárban a fizu: " + gyarSzolgaltatas.munkasokFizuja(elsoGyar));
        System.out.println("Átlagéletkor az első gyárban: " + gyarSzolgaltatas.atlagEletkor(elsoGyar));

        System.out.println("A második gyárban dolgozók: " + gyarSzolgaltatas.munkasokSzama(masodikGyar));
        System.out.println("A második gyárban a fizu: " + gyarSzolgaltatas.munkasokFizuja(masodikGyar));
        System.out.println("A második gyárban főnök fizuja: " + gyarSzolgaltatas.fonokFizu(masodikGyar));

        System.out.println("A kora: " + dolgozokSzolgaltatas.hanyEves(elsoDolgozo));

        System.out.println("A járó szabadnapok: " + dolgozokSzolgaltatas.szabiNap(harmadikDolgozo));

        System.out.println("Maradék szabinapok: " + dolgozokSzolgaltatas.kivettSzabi(masodikDolgozo,6));

        System.out.println("A dolgozok paraméterei: " + gyarSzolgaltatas.dolgozokParameterei(elsoGyar));

        System.out.println("A dolgozó heti bruttó fizuja: " + dolgozokSzolgaltatas.dolgozoBruttoFizuja(elsoDolgozo));
        System.out.println("A dolgozó heti bruttó fizuja: " + dolgozokSzolgaltatas.dolgozoBruttoFizuja(elsoFonok));

        System.out.println("A dolgozó heti nettó fizuja: " + dolgozokSzolgaltatas.dolgozoNettoFizuja(elsoDolgozo));
        System.out.println("A dolgozó heti nettó fizuja: " + dolgozokSzolgaltatas.dolgozoNettoFizuja(elsoFonok));

    }
}