package ocp8.ch04.review;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Two {

    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(() -> "growl! ");
        Stream<String> stream2 = Stream.generate(() -> "growl! ");
        boolean b1 = stream1.anyMatch(predicate); //true
        boolean b2 = stream2.allMatch(predicate); //code hangs!
        System.out.println(b1 + " " + b2);
    }
}
