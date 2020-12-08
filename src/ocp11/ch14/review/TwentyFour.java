package ocp11.ch14.review;

import java.util.Set;

public class TwentyFour {

    public static void main(String[] args) {
        Set<?> set = Set.of("lion", "tiger", "bear");
        var s = Set.copyOf(set);
        s.forEach(System.out::println);
    }
}
