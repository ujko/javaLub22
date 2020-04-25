package test;

public class Obcy {
    private int wiek;
    public static final String MOJA_STALA = "jakas stala";
    Dziecko d;

    public Obcy() {}

    public Obcy(int wiek) {
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek < 0) {
            throw new IllegalArgumentException("Podałeś nieprawidłowy wiek");
        }
        this.wiek = wiek;
    }

    private void method() {

    }
}
