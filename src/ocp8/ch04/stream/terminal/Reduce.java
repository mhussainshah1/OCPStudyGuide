package ocp8.ch04.stream.terminal;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {

    public static void main(String[] args) {
        //Java 7
        String[] array = new String[]{"w", "o", "l", "f"};
        String result = "";
        for (String s : array) {
            result = result + s;
        }
        System.out.println(result);

        //Java 8
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        //or
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        String word1 = stream1.reduce("", String::concat);
        System.out.println(word1); // wolf

        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println(stream2.reduce(1, (a, b) -> a * b));//90
//        System.out.println(stream2.reduce((a, b) -> a * b

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        BinaryOperator<Integer> opr = (a, b) -> a * b;
        Stream<Integer> stream3 = Stream.of(3, 5, 6);
        System.out.println(stream3.reduce(1, opr, opr)); // 90
    }
}