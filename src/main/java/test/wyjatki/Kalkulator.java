package test.wyjatki;

public class Kalkulator {
    public double divide(double a, double b) throws MojBladException {
        if(b == 0.0) {
            throw new MojBladException("Nie dzieli sie przez 0");
        }
        return a / b;
    }

    public int divide(int a, int b) {
        if(b == 0) {
            throw new MojUncheckedException("Nie dzieli sie przez 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new Kalkulator().divide(1, 0));
        } catch (MojUncheckedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(new Kalkulator().divide(1.1, 0.0));
            System.out.println("czesc dalsza");
        } catch (MojBladException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Koniec programu");
    }
}
