package ocp11.ch16.review;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Five {

    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020-04-30",
//                 DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date.getYear() + " "
                + date.getMonth() + " " + date.getDayOfMonth());
    }
}