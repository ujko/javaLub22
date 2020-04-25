package test.dziedziczenie;

public interface SzkolaInterface {
    int age = 6;

    int licz(int a, int b);

    default void licz2(int a) {
        System.out.println(2 * a);
    }
}
