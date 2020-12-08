package ocp11.ch15.stream.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Peek {

    public static void main(String[] args) {
        var stream = Stream.of("black bear", "brown bear", "grizzly");//Stream<String>
        long count
                = stream.filter(s -> s.startsWith("g"))
                        .peek(System.out::println)
                        .count(); // grizzly
        System.out.println(count); // 1

        //witout peek
        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');
        Stream<List<?>> stream1 = Stream.of(numbers, letters);
        stream1.map(List::size)
                .forEach(System.out::print); // 11


        //Bad Peek - update variable and result of stream
        Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(x -> x.remove(0))
                .map(List::size)
                .forEach(System.out::print); // 00      
        System.out.println(numbers + " "+ letters);
    }
}
