package ocp8.ch04.review;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fourteen {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1);
        IntStream is = s.mapToInt(x -> x);
        DoubleStream ds = s.mapToDouble(x -> x);
        Stream<Integer> s2 = ds.mapToInt(x -> (int)x);
        s2.forEach(System.out::print);
    }
}