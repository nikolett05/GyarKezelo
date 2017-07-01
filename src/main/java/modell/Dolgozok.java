package modell;

import java.time.LocalDate;
import java.util.List;

public class Dolgozok {

    private String dolgozoNeve;
    private int dolgozoKora;
    private String dolgozoBeosztasa;
    private double dolgozoFizetese;
    private String dolgozoNeme;
    private LocalDate dolgozoSzuletesnapja;
    private int aDolgozoGyerekeinekszama;
    private boolean aDolozoVakE;
    private List<Gyerekek> aDolgozoGyerekei;
    private int aDolgozoSzabadnapjai;

    public Dolgozok(String dolgozoNeve, int dolgozoKora, String dolgozoBeosztasa, double dolgozoFizetese, String dolgozoNeme, LocalDate dolgozoSzuletesnapja, int aDolgozoGyerekeinekszama, boolean aDolozoVakE, int aDolgozoSzabadnapjai) {
        super();
        this.dolgozoNeve = dolgozoNeve;
        this.dolgozoKora = dolgozoKora;
        this.dolgozoBeosztasa = dolgozoBeosztasa;
        this.dolgozoFizetese = dolgozoFizetese;
        this.dolgozoNeme = dolgozoNeme;
        this.dolgozoSzuletesnapja = dolgozoSzuletesnapja;
        this.aDolgozoGyerekeinekszama = aDolgozoGyerekeinekszama;
        this.aDolozoVakE = aDolozoVakE;
        this.aDolgozoSzabadnapjai = aDolgozoSzabadnapjai;
    }

    public String getDolgozoNeve() {
        return dolgozoNeve;
    }

    public void setDolgozoNeve(String dolgozoNeve) {
        this.dolgozoNeve = dolgozoNeve;
    }

    public int getDolgozoKora() {
        return dolgozoKora;
    }

    public void setDolgozoKora(int dolgozoKora) {
        this.dolgozoKora = dolgozoKora;
    }

    public String getDolgozoBeosztasa() {
        return dolgozoBeosztasa;
    }

    public void setDolgozoBeosztasa(String dolgozoBeosztasa) {
        this.dolgozoBeosztasa = dolgozoBeosztasa;
    }

    public double getDolgozoFizetese() {
        return dolgozoFizetese;
    }

    public void setDolgozoFizetese(double dolgozoFizetese) {
        this.dolgozoFizetese = dolgozoFizetese;
    }

    public String getDolgozoNeme() {
        return dolgozoNeme;
    }

    public void setDolgozoNeme(String dolgozoNeme) {
        this.dolgozoNeme = dolgozoNeme;
    }

    public LocalDate getDolgozoSzuletesnapja() {return dolgozoSzuletesnapja;}

    public void setDolgozoSzuletesnapja(LocalDate dolgozoSzuletesnapja) { this.dolgozoSzuletesnapja = dolgozoSzuletesnapja;}

    public int getGyerekekszama() {return aDolgozoGyerekeinekszama;}

    public void setGyerekekszama(int gyerekekszama) {this.aDolgozoGyerekeinekszama = gyerekekszama;}

    public boolean isaDolozoVakE() { return aDolozoVakE; }

    public void setaDolozoVakE(boolean aDolozoVakE) { this.aDolozoVakE = aDolozoVakE; }

    public List<Gyerekek> getaDolgozoGyerekei() { return aDolgozoGyerekei;}

    public void setaDolgozoGyerekei(List<Gyerekek> aDolgozoGyerekei) {this.aDolgozoGyerekei = aDolgozoGyerekei;}

    public int getaDolgozoSzabadnapjai() {return aDolgozoSzabadnapjai;}

    public void setaDolgozoSzabadnapjai(int aDolgozoSzabadnapjai) {this.aDolgozoSzabadnapjai = aDolgozoSzabadnapjai;}

    @Override
    public String toString() {
        return "Dolgozok{" +
                "dolgozoNeve='" + dolgozoNeve + '\'' +
                ", dolgozoKora=" + dolgozoKora +
                ", dolgozoBeosztasa='" + dolgozoBeosztasa + '\'' +
                ", dolgozoFizetese=" + dolgozoFizetese +
                ", dolgozoNeme='" + dolgozoNeme + '\'' +
                ", dolgozoSzuletesnapja=" + dolgozoSzuletesnapja +
                ", gyerekekszama=" + aDolgozoGyerekeinekszama +
                ", aDolozoVakE=" + aDolozoVakE +
                ", aDolgozoGyerekei=" + aDolgozoGyerekei +
                ", aDolgozoSzabadnapjai=" + aDolgozoSzabadnapjai +
                '}';
    }
}
