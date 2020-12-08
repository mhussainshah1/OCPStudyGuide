package ocp11.ch15.review;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Three {

    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
//        boolean b1 = stream.noneMatch(predicate); //false
        boolean b1 = stream.anyMatch(predicate);//IllegalStateException: stream has already been operated upon or closed
        System.out.println(b1 + " " /*+ b2*/);
    }
}
