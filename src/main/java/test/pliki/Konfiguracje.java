package test.pliki;

import java.io.*;
import java.util.Properties;

public class Konfiguracje {
    public static void main(String[] args) throws IOException {
//        zapiszConfig();
        czytajConfig();
    }

    private static void czytajConfig() throws IOException {

        InputStream is = new FileInputStream("Konfiguracja.cfg");
        Properties prop = new Properties();
        prop.load(is);
        System.out.println(prop.get("user-name"));
        System.out.println(prop.get("user-city"));
        is.close();
    }

    private static void zapiszConfig() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("user-name", "Pawel");
        prop.setProperty("user-city", "Krakow");

        OutputStream os = new FileOutputStream("Konfiguracja.cfg");
        prop.store(os, "Nasz komentarz");
        os.flush();
        os.close();
    }


}
