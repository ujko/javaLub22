package test.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        RegexTest rt = new RegexTest();
//        rt.setEmail("testgmail.com.pl");
//        System.out.println(rt.getEmail());
        String informacje = "Marian Kowalski 600-625-420 80-422 Sopot";
        String pattern = "([a-z,A-Z]+)\\s+([a-z,A-Z]+)\\s+([0-9,\\-]{9,12})\\s([0-9,\\-]{6})\\s([a-z,A-Z]{2,})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(informacje);
        if (m.find()) {
            System.out.println("Imie : " + m.group(1));
            System.out.println("Nazwisko : " + m.group(2));
            System.out.println("Telefon : " + m.group(3));
            System.out.println("Kod pocztowy : " + m.group(4));
            System.out.println("Miasto : " + m.group(5));
        } else {
            System.out.println("Nie udalo sie znalezc poszukiwanych informacji");
        }

    }
}
