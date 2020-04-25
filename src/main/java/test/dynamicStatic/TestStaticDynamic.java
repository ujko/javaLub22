package test.dynamicStatic;

public class TestStaticDynamic {
    public int age;
    public static int staticAge;

    public void pomnoz() {
        age *= staticAge;
    }

    public static void pomnoz(TestStaticDynamic tsd) {
        //age *= staticAge; nie ma dostepu do zmiennych dynamicznych
        tsd.age *= staticAge;
    }
}
