package ocp11.ch15.stream.intermediate;

import java.util.stream.Stream;

public class LimitSkip {

    public static void main(String[] args) {
        /*Stream<Integer> s =*/ Stream.iterate(1, n -> n + 1)/*;
        s.skip(5).limit(2)*/.forEach(System.out::println); // 67
    }
}
