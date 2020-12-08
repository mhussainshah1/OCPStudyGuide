package ocp8.ch04.review;

import java.util.stream.Stream;

public class Ten {

    public static void main(String[] args) {
        Stream.generate(() -> "1")
//                .filter(x -> x.length() > 1) //false: No element passthrough filter
                .limit(10)
//                .peek(System.out::println)
                .forEach(System.out::print);
    }
}
