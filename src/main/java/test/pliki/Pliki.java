package test.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Pliki {
    private static final String NAZWA_PLIKU = "test.txt";

    public static void main(String[] args) throws IOException {
//        zapiszDoPliku("Jakis tekst testowy");
//        czytajZPliku();
//        czytajZPliku2();
        zapiszDoPliku2("Kolejny text");
    }

    private static void czytajZPliku2() throws IOException {
        Files.readAllLines(Paths.get(NAZWA_PLIKU))
                .forEach(x -> System.out.println(x));
//        Files.readAllLines(Paths.get(NAZWA_PLIKU))
//                .stream()
//                .forEach(System.out::println);
    }

    private static void zapiszDoPliku2(String text) throws IOException {
        Files.write(Path.of(NAZWA_PLIKU), text.getBytes());
    }

    private static void czytajZPliku(String text) {
        try (PrintWriter pw = new PrintWriter(NAZWA_PLIKU)) {
            pw.print(text);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter(NAZWA_PLIKU);
//            pw.print(text);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if(pw != null) {
//                pw.close();
//            }
//        }

    }


    private static void czytajZPliku() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(NAZWA_PLIKU));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

}
