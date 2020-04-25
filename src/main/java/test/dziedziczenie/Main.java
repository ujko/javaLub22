package test.dziedziczenie;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc(4,5, (x, y)  -> x - y));
    }

    private static int calc(int a, int b, SzkolaInterface si) {
        return si.licz(a, b);
    }

    public void first() {
        Szkola[] szkoly = new Szkola[3];
        szkoly[0] = new Szkola2();
        szkoly[1] = new Szkola3();
        szkoly[2] = new Szkola() {
            @Override
            void abstrMeth() {
                System.out.println("a to jest abstrakcyjna klasa szkola");
            }
        };

        for(Szkola ss : szkoly) {
            ss.abstrMeth();
        }
    }
}
