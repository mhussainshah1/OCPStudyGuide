package ocp8.ch04.review;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Twenty {

    public static void main(String[] args) {
        List<Integer> l = IntStream.range(1, 6)
                .mapToObj(i -> i)
                .collect(Collectors.toList());
        l.forEach(System.out::println);

        IntStream.range(1, 6)
                .mapToObj(i -> i)
                .forEach(System.out::println);
        
        //Simplest Way of Writing Code
        IntStream.range(1, 6)
                .forEach(System.out::println);
    }
}
