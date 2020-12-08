package ocp11.ch15.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        var one = Arrays.asList("Bonobo");
        var two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        
        Stream<List<String>> animals = Stream.of(zero, one, two);
        Stream<String> stream = animals.flatMap(List::stream);//combine all lists in a stream 

        stream.forEach(System.out::println);
    }
}
