package ocp11.ch05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20

        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        //2020-01-20
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        //11:12:34
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        //2020-01-20T11:12:34

        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDate.format(dateTime)); // 1/20/20
        System.out.println(shortDate.format(date)); // 1/20/20
        //System.out.println(shortDateTime.format(time));
        // UnsupportedTemporalTypeException:Time cant be formatted as date

        //or
        shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDate));//Jan 20, 2020
        System.out.println(date.format(shortDate));//Jan 20, 2020
        //System.out.println(time.format(shortDateTime));

        //SHORT, MEDIUM
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM

        //User Define Formats
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f)); // January 20, 2020, 11:12

        f = DateTimeFormatter.ofPattern("hh:mm");
        f.format(dateTime); //  11:22
        //f.format(date);
        f.format(time);     //  11:22

        //Parsing String into Date and Times
        f = DateTimeFormatter.ofPattern("MM dd yyyy");
        date = LocalDate.parse("01 02 2015", f);
        time = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22
    }
}
