package ocp8.ch04.review;

import java.util.stream.Stream;

public class One {

    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", s -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));

        stream = Stream.iterate("", s -> s + "1");
        stream.limit(3)
                .map(x -> x + "2")
                .forEach(System.out::println);//2
        //12
    }
}
