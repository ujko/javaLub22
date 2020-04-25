package test;

public class Osoba {
    private int privateA; //tylko w tej klasie
    /**
     * w tym samym pakiecie i w klasach dziedziczących
     */
    protected int protectedB;
    /**
     * w tym samym pakiecie
     */
    int packageC;
    /**
     * wszędzie
     */
    public int publicD;



    /**
     * Metoda wypisujaca wiek
     * @param wiek
     */
    public void podajWiek(int wiek) {
        System.out.printf("Masz %10d lat", wiek );
        //Jakis komentarz jednoliniowy
        /*komentarz wieloliniowy*/
    }
}
