package ocp8.ch04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyStream {

    public static void main(String[] args) {
        //Finite stream
        Stream<String> empty = Stream.empty(); // count = 0
        System.out.println(empty);
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 2
        
        //list to stream
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();
        
        //Infinite Stream
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        randoms.forEach(System.out::println);
    }
}