package ocp8.ch04.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(List::stream).forEach(System.out::println);
    }
}