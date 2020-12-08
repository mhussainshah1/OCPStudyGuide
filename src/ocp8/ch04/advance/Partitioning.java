package ocp8.ch04.advance;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitioning {

    public static void main(String[] args) {
        //Map value is List
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map); // {false=[tigers], true=[lions, bears]}

        ohMy = Stream.of("lions", "tigers", "bears");
        map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map); // {false=[], true=[lions, tigers, bears]}

        //Map value is Set
        ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map1 = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        System.out.println(map1);// {false=[], true=[lions, tigers, bears]}

        ohMy = Stream.of("lions", "tigers", "bears", "hen");
        Map<Integer, Long> map2 = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map2); // {5=2, 6=1}

    }
}
