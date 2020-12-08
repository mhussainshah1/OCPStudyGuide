package ocp11.ch15.stream.primitive;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n));

        //Alternatively,
        stream = Stream.of(1, 2, 3);
        System.out.println(stream.mapToInt(x -> x).sum());

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        Random ran = new Random();
        intStream = ran.ints();
        intStream.limit(3).forEach(System.out::println);

        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::println);

        //Alternatively,
        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::println);

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
    }
}