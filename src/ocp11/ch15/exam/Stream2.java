package ocp11.ch15.exam;

import java.util.List;
import java.util.stream.Stream;

/**
 * You want to print the result as 110 111 112 113. Which statement on line 1
 * will accomplish this?
 */
public class Stream2 {

    public static void main(String[] args) {
        List<Integer> a = List.of(113, 110);
        List<Integer> b = List.of(112, 111);
        // line 1
//        Stream.of(a, b).flatMap(c -> c.stream().sorted()).forEach(i -> System.out.print(i + " "));
//        Stream.of(a).map(b -> b.stream()).sorted().forEach(i -> System.out.print(i + " "));
//        Stream.concat(a, b).sorted().forEach(i -> System.out.print(i + " "));
        Stream.of(a, b).flatMap(c -> c.stream()).sorted().forEach(i -> System.out.print(i + " "));
    }
}