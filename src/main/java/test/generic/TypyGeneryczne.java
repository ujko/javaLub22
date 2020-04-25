package test.generic;

public class TypyGeneryczne {

    public static void main(String[] args) {
        Gener g = new Gener();
        g.setO("jakis string");
        System.out.println(g.getO());
        String s = (String) g.getO();

        Gener<String> s2 = new Gener<>();
        String bb = s2.getT();
    }
}
