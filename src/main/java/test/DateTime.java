package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {


    public static void main(String[] args) {
//        Date dzis = new Date();
//        System.out.println(dzis);

        LocalDateTime dzis = LocalDateTime.now();
        System.out.println(dzis);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm");
        System.out.println(dzis.format(formatter));
        LocalDateTime jutro = dzis.plusDays(1);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH::mm");
        System.out.println(jutro.format(formatter1));
    }
}
