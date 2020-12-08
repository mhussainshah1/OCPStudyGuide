package ocp11.ch16.review;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Seven {

    public static void main(String[] args) {
        String pattern = "#,###,000.0#";
        var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));
        System.out.println("<" + message + ">");
    }
}
