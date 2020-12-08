package ocp11.ch16.datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class MyDateTime {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalDate date2 = LocalDate.of(2020, 10, 20);

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        var dt1 = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(6, 15);
        var dt2 = LocalDateTime.of(date, time);

        date = LocalDate.of(2020, Month.OCTOBER, 20);
        System.out.println(date.getDayOfWeek()); // TUESDAY
        System.out.println(date.getMonth()); // OCTOBER
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 294        
    }
}