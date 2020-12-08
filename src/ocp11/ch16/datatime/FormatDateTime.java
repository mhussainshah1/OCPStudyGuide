package ocp11.ch16.datatime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_TIME)); //Error
//        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_DATE)); //Error
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f)); // October 20, 2020 at 11:12

        DateFormat s = new SimpleDateFormat("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(s.format(new Date())); // October 20, 2020 at 06:15 

        dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dt.format(formatter1));
        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        System.out.println(dt.format(formatter2));
        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
//        System.out.println(dt.format(formatter3));

        var dateTime = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dateTime.format(formatter)); // 10/20/2020 06:15:30
        //or
        System.out.println(formatter.format(dateTime)); // 10/20/2020 06:15:30

        //Adding Custom Text
        dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
        System.out.println(dt.format(f1) + "at" + dt.format(f2));

        f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f)); // October 20, 2020 at 06:15

        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1)); // October 20, Party's at 06:15
        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
        System.out.println(dt.format(g2)); // System format, hh:mm: 06:15
        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
        System.out.println(dt.format(g3)); // NEW! 2020, yay!

//        DateTimeFormatter.ofPattern("The time is hh:mm"); // Exception thrown
        DateTimeFormatter.ofPattern("'Time is: hh:mm: "); // Exception thrown
    }
}