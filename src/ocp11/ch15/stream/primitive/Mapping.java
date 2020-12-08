package ocp11.ch15.stream.primitive;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Mapping {

    public static void main(String[] args) {
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());

        //flatMapToXXX
        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));
        DoubleStream doubles = integerList.stream()
                .flatMapToDouble(x -> DoubleStream.of(x));
        LongStream longs = integerList.stream()
                .flatMapToLong(x -> LongStream.of(x));
    }

    private static Stream<Integer> mapping(IntStream stream) {
        return stream.mapToObj(x -> x);
    }

    private static Stream<Integer> boxing(IntStream stream) {
        return stream.boxed();
    }
}
