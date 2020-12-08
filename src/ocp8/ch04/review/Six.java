package ocp8.ch04.review;

import java.util.stream.Stream;

public class Six {

    public static void main(String[] args) {
        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.allMatch(String::isEmpty);
        System.out.println(match);

//        s = Stream.generate(() -> "meow");
//        match = s.anyMatch(String::isEmpty); //hangs
//        System.out.println(match);
//        s = Stream.generate(() -> "meow");
//        match = s.noneMatch(String::isEmpty); //hangs
//        System.out.println(match);
    }
}
