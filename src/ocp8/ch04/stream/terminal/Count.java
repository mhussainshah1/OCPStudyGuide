package ocp8.ch04.stream.terminal;

import java.util.stream.Stream;

public class Count {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
    }
}
