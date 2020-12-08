package ocp8.ch04.stream.intermediate;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sort {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print); // bear-brown-

        Stream<String> s1 = Stream.of("brown bear-", "grizzly-");
        s1.sorted(Comparator.reverseOrder())
          .forEach(System.out::print); // grizzly-brown bear-

//        s1.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
    }
}