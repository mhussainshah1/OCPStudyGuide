package ocp11.ch05.reviews;

import java.time.LocalDate;
import java.time.Month;

public class StartOfSummer {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2014, 6, 21);
        LocalDate date2 = LocalDate.of(2014, Month.JUNE, 21);
    }
}
