package ocp11.ch15.review;

import java.util.stream.Stream;

public class One {

    public static void main(String[] args) {
        var stream = Stream.iterate("", s -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));

        //check
        Stream.iterate("", s -> s + "1")
                .limit(3)
                .map(x -> x + "2")
                .forEach(System.out::println);//2, 12, 112
    }
}
