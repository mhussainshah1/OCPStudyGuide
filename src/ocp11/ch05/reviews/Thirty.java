package ocp11.ch05.reviews;

import java.time.LocalDate;
import java.time.Month;

public class Thirty {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
