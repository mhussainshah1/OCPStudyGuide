package ocp11.ch16.review;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TwentyTwo {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2020, 5, 10, 11, 22, 33);
        var f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(ldt.format(f));
    }
}
