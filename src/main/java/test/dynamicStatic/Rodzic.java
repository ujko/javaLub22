package test.dynamicStatic;

public class Rodzic {

    public void test() {
        class A {
            public void test2(int a) {
                System.out.println("dos");
            }
        }
        new A().test2(2);
    }

    public static class Dziecko {
        public void wypisz() {
            System.out.println("Metoda klasy Dziecko w klasie Rodzic");
        }
    }

    public class DrugieDziecko {
        public void wypisz() {
            System.out.println("Metoda klasy DrugieDziecko w klasie Rodzic");
        }
    }

    public static void main(String[] args) {
        Dziecko d = new Dziecko();
        d.wypisz();
        DrugieDziecko dd = new Rodzic().new DrugieDziecko();
        dd.wypisz();
    }

}
