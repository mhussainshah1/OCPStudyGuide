package ocp8.ch04.advance;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingCollectors {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears

        ohMy = Stream.of("lions", "tigers", "bears");
        Double results = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(results); // 5.333333333333333

        ohMy = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result1 = ohMy.filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result1); // [tigers]
        
        //or
        
        ohMy = Stream.of("lions", "tigers", "bears");
        Set<String> result2 = ohMy.filter(s -> s.startsWith("t"))
                .collect(Collectors.toSet());
        System.out.println(result2); // [tigers]
    }
}
