package ocp8.ch04.stream.terminal;

import java.util.stream.Stream;

public class Find {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("beezyanka", "monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
    }
}