package szolgaltatas.impl;

import modell.Dolgozok;
import modell.Gyerekek;
import szolgaltatas.interfaces.DolgozokSzolgaltatas;
import tipusok.Beosztasok;

import java.time.LocalDate;
import java.util.List;

import static java.time.Period.between;
import static java.time.temporal.ChronoUnit.YEARS;

public class DolgozokSzolgaltatasImpl implements DolgozokSzolgaltatas {

    @Override
    public int hanyEves(Dolgozok dolgozo) {
        return (int) YEARS.between(dolgozo.getDolgozoSzuletesnapja(), LocalDate.now());
    }

    @Override
    public int szabiNap(Dolgozok dolgozo) {

        List<Gyerekek> dolgozoGyerekei = dolgozo.getaDolgozoGyerekei();
        int years = hanyEves(dolgozo);
        int alapSzabi = 0;

        if (years >= 25) {
            alapSzabi = 21;
        }
        if (years >= 28) {
            alapSzabi = 22;
        }
        if (years >= 31) {
            alapSzabi = 23;
        }
        if (years >= 33) {
            alapSzabi = 24;
        }
        if (years >= 35) {
            alapSzabi = 25;
        }
        if (years >= 37) {
            alapSzabi = 26;
        }
        if (years >= 39) {
            alapSzabi = 27;
        }
        if (years >= 41) {
            alapSzabi = 28;
        }
        if (years >= 43) {
            alapSzabi = 29;
        }
        if (years >= 45) {
            alapSzabi = 30;
        }

        int potSzabi = 0;

        if (years < 18 || dolgozo.isaDolozoVakE()) {
            potSzabi = 5;
        }

        if (dolgozoGyerekei == null) {
            System.out.println("A dolgozónak nincs gyereke");
        } else {
            for (Gyerekek gyerek : dolgozoGyerekei) {
                if (gyerek.getKora() <= 16 && dolgozo.getGyerekekszama() <= 2) {
                    potSzabi = 2 * dolgozo.getGyerekekszama();
                } else if (gyerek.getKora() < 16 && dolgozo.getGyerekekszama() > 2) {
                    potSzabi = 7;
                }
            }
        }
        return alapSzabi + potSzabi;
    }

    @Override
    public int kivettSzabi(Dolgozok dolgozo, int kivettNapok) {
        return dolgozo.getaDolgozoSzabadnapjai() - kivettNapok;
    }

    @Override
    public int dolgozoBruttoFizuja(Dolgozok dolgozo) {
        if (dolgozo.getDolgozoBeosztasa().equals(Beosztasok.FŐNŐK.name())) {
            return 0;
        } else if (dolgozo.getDolgozoBeosztasa().equals(Beosztasok.HELYETTES.name())) {
            return 45 * 1200 + 40000;
        } else if (dolgozo.getDolgozoBeosztasa().equals(Beosztasok.MUNKAVEZETŐ.name())) {
            return 45 * 1200 + 25000;
        } else return 45 * 1200;
    }
        @Override
    public double dolgozoNettoFizuja(Dolgozok dolgozo){
            return dolgozoBruttoFizuja(dolgozo) * 0.60;
        }
}