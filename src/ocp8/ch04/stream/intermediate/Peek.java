package ocp8.ch04.stream.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Peek {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count
                = stream.filter(s -> s.startsWith("g"))
                        .peek(System.out::println)
                        .count(); // grizzly
        System.out.println(count); // 1

        //witout peek
        List<Integer> numbers = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');
        Stream<List<?>> stream1 = Stream.of(numbers, letters);
        stream1.map(List::size)
                .forEach(System.out::print); // 11

        //Good Peek - update variable but result of stream
        StringBuilder builder = new StringBuilder();
        Stream<List<?>> good = Stream.of(numbers, letters);
        good.peek(l -> builder.append(l))
                .map(List::size)
                .forEach(System.out::print); // 11
        System.out.println(builder); // [1][a]

        //Bad Peek - update variable and result of stream
        Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(l -> l.remove(0))
                .map(List::size)
                .forEach(System.out::print); // 00       
    }
}
