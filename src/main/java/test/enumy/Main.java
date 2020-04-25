package test.enumy;

public class Main {
    public static void main(String[] args) {
        Kolor red = Kolor.CZERWONY;
//        red.setHexCode("#222222");
        Kolor red2 = Kolor.CZERWONY;

        System.out.println(red == red2);
        System.out.println(red2.getHexCode());

    }

    private static void getHexColor(Kolor kolor) {
        System.out.println(kolor.getHexCode());
        switch (kolor) {
            case CZERWONY:
                System.out.println("to jest czerwony");
                break;
            case BIALY:
                System.out.println("to jest biały");
                break;
            case ZIELONY:
                System.out.println("to jest zielony");
                break;
            default:
                System.out.println("żaden");
        }
    }
}
