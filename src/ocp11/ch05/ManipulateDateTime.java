package ocp11.ch05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;

public class ManipulateDateTime {

    public static void main(String[] args) {
        //Future
        LocalDate date = LocalDate.of(2019, Month.JANUARY, 20);
        System.out.println(date); // 2019-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2019-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // 2019-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2019-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28

        //Backward
        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); // 2020-01-20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30
        //or
        date = LocalDate.of(2020, Month.JANUARY, 20);
        time = LocalTime.of(5, 15);
        dateTime = LocalDateTime.of(date, time)
                .minusDays(1)
                .minusHours(10)
                .minusSeconds(30);

        date = LocalDate.of(2020, Month.JANUARY, 20);//Date & Time Classes are immutable
        date.plusDays(10);
        System.out.println(date);//2020-01-20

        date = LocalDate.of(2020, Month.JANUARY, 20);
        //date = date.plusMinutes(1); // DOES NOT COMPILE

        //Returning long
        System.out.println(LocalDate.EPOCH);//1970-01-01
        System.out.println(LocalDate.now().toEpochDay());
        System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    }
}
