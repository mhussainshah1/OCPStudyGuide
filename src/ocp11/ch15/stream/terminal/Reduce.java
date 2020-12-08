package ocp11.ch15.stream.terminal;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {

    public static void main(String[] args) {
        //Java 7
        String[] array = new String[]{"w", "o", "l", "f"};
        String result = "";
        for (var s : array) {
            result = result + s;
        }
        System.out.println(result);

        //Java 8
        //1
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        String word = stream1.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        //or
        stream1 = Stream.of("w", "o", "l", "f");
        String word1 = stream1.reduce("", String::concat);
        System.out.println(word1); // wolf

        //2
        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println(stream2.reduce(1, (a, b) -> a * b));//90
        System.out.println(Stream.of(3, 5, 6).reduce((a, b) -> a * b));//Optional[90]

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        //3
        Stream<String> stream3 = Stream.of("w", "o", "l", "f!");
        int length = stream3.reduce(0, (i, s) -> i + s.length(), (a, b) -> a + b);
        System.out.println(length); // 5
        
        Stream.of("w", "o", "l", "f!")
                .reduce(0, (i, s) -> i + s.length(), (a, b) -> a + b);
        System.out.println(length); // 5
    }
}
