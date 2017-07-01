package modell;

public class Gyerekek {

    private String neve;
    private int kora;

    public Gyerekek(String neve, int kora) {
        this.neve = neve;
        this.kora = kora;
    }

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    public int getKora() {
        return kora;
    }

    public void setKora(int kora) {
        this.kora = kora;
    }

    @Override
    public String toString() {
        return "Gyerekek{" +
                "neve='" + neve + '\'' +
                ", kora=" + kora +
                '}';
    }
}
