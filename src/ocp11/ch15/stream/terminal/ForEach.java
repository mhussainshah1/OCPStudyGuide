package ocp11.ch15.stream.terminal;

import java.util.stream.Stream;

public class ForEach {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo

        Stream s1 = Stream.of(1);
//        for (Integer i : s1){ } // DOES NOT COMPILE
    }
}
