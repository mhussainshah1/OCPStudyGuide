package ocp11.ch15.review;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Two {

    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.startsWith("g");
        var stream1 = Stream.generate(() -> "growl! ");
        var stream2 = Stream.generate(() -> "growl! ");
        var b1 = stream1.anyMatch(predicate); //true
        var b2 = stream2.allMatch(predicate); //code hangs!
        System.out.println(b1 + " " + b2);
    }
}
