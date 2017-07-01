package modell;

import java.util.List;

public class Gyar {

    private String gyarNeve;
    private int munkasokSzama;
    private List<Dolgozok> dolgozok;

    public Gyar(String gyarNeve, int munkasokSzama) {
        super();
        this.gyarNeve = gyarNeve;
        this.munkasokSzama = munkasokSzama;
    }

    public String getGyarNeve() {
        return gyarNeve;
    }

    public void setGyarNeve(String gyarNeve) {
        this.gyarNeve = gyarNeve;
    }

    public int getMunkasokSzama() {
        return munkasokSzama;
    }

    public void setMunkasokSzama(int munkasokSzama) {
        this.munkasokSzama = munkasokSzama;
    }

    public List<Dolgozok> getDolgozok() {
        return dolgozok;
    }

    public void setDolgozok(List<Dolgozok> dolgozok) {
        this.dolgozok = dolgozok;
    }

    @Override
    public String toString() {
        return "Gyar{" +
                "gyarNeve='" + gyarNeve + '\'' +
                ", munkasokSzama=" + munkasokSzama +
                ", dolgozok=" + dolgozok +
                '}';
    }
}
