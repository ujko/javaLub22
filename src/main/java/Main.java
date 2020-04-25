import test.Obcy;
import test.Osoba;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().licz(2,5));
    }

    private int licz(int a, int b) {
        return a * 2 * b;
    }

    private void druga() {
        new Obcy().setWiek(3);
        Obcy o = new Obcy();
        o.setWiek(-1);
        System.out.println(o.getWiek());
    }

    private static void wywolania() {
        System.out.println(calc("Home", 3, 4, 6, 7, 6, 4));
    }

    private static int calc(String b, int...a) {
        System.out.println(b);
        int res = 0;
        for(int i : a) {
            res += i;
        }
        return res;
    }


    private void pierwsza() {
        //        var list = List.of("1", "2", "All OK\n".repeat(2));
//        list.stream().filter(x -> x.length() > 1).forEach(System.out::println);

//        String s = "dom";
//        s += " witaj";
//        System.out.println(s);

//        int a,b = 7;
//        System.out.println(a++); //7
//        System.out.println(++a); //9
//        System.out.println(a--);//9
//        System.out.println(--a);//7

        String a1 = "dom";
        String a2 = "dom";
        String a3 = new String("dom");

        System.out.println(a1 == a2); //true
        System.out.println(a1 == a3); //false
        System.out.println(a1.equals(a3)); //true

        Osoba o = new Osoba();
        o.podajWiek(4);
    }

    private void warunkowe() {
        int a = 7;
//        if(a > 3) {
//            System.out.println("wieksze od 3");
//        } else if (a == 3) {
//            System.out.println("równe 3");
//        } else {
//            System.out.println("mniejsze od 3");
//        }
//
//        System.out.println(a > 5 ? "wieksze od 5" : a == 5 ? "rowne 5" : "mniejsze niż 5");
        a = 4;

        switch (a) {
            case 4 :
                System.out.println("a = 4");
                break;
            case 5 :
                System.out.println("a = 5");
                break;
            default:
                System.out.println("żadne z powyższych");
        }
    }

    private void petle() {
        int a = 5;
        String przecinek = "";
        for (int i = 1; i <= 5; i++) {
            System.out.print(przecinek + i);
            przecinek = ", ";
        }
//
        int j = 6;
        while (j <= a) {
            System.out.print(j + ", ");
            j++;
        }

        do {
            System.out.print(j + ", ");
            j++;
        } while (j <= a);

//        for(int i = 1; i<10 ; i++) {
//            Thread.sleep(500);
//            System.out.print(i + ", ");
//            i %= a;
//        }

        //        int[] a = new int[5];
//        a[2] = 5;

        int[][] tab = new int[5][5];
        tab[0][3] = 17;

        for(int[] aa : tab) {
            for(int b : aa) {
                System.out.print(b + ", ");
            }
            System.out.println();
        }
//        for(int i : a) {
//            System.out.print(i + ", ");
//        }
        int[][] tab1 = {{2,3},{1},{5,6,7,8,9,7,6}};
        for (int[] aaa : tab1) {
            for (int b : aaa) {
                System.out.printf("%2d", b);
            }
            System.out.println();
        }
    }

    private static void kalkulator(int x, int y) {
        int[][] c = new int[x][y];
        for (int i = 0; i < c.length ; i++) {
            for (int j = 0; j < c[i].length ; j++) {
                c[i][j] = (i+1) * (j+1);
            }
        }
        for (int[] a : c) {
            for (int b : a) {
                System.out.printf("%5d", b);
            }
            System.out.println();
        }
    }
}
