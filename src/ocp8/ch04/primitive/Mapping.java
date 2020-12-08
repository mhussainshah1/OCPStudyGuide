package ocp8.ch04.primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mapping {

    public static void main(String[] args) {
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        
        List<Integer> list = Arrays.asList(1,2,3);
        IntStream ints =list.stream().flatMapToInt(x -> IntStream.of(x));
    }
}