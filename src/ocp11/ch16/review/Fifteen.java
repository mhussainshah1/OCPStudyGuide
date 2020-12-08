package ocp11.ch16.review;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Fifteen {

    public static void main(String[] args) {
        var f = DateTimeFormatter.ofPattern("hh' o''clock'");
        System.out.println(f.format(ZonedDateTime.now()));
//        System.out.println(f.format(LocalDate.now()));
        System.out.println(f.format(LocalDateTime.now()));
        System.out.println(f.format(LocalTime.now()));
    }
}
