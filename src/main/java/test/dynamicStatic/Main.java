package test.dynamicStatic;

public class Main {
    public static void main(String[] args) {
        Rodzic.Dziecko rd = new Rodzic.Dziecko();
        rd.wypisz();

        Rodzic.DrugieDziecko dd = new Rodzic().new DrugieDziecko();
        dd.wypisz();
    }

    private void met1() {
        TestStaticDynamic tsd1 = new TestStaticDynamic();
        TestStaticDynamic tsd2 = new TestStaticDynamic();
        tsd1.age = 66;
        tsd2.age = 17;
        TestStaticDynamic.staticAge = 102;
        TestStaticDynamic.pomnoz(tsd1);
        tsd1.pomnoz();
        tsd2.pomnoz();

        System.out.println(tsd1.age + ", " + tsd2.age);
    }
}
