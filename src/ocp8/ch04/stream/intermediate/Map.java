package ocp8.ch04.stream.intermediate;

import java.util.stream.Stream;

public class Map {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length).forEach(System.out::println); // 676
    }
}