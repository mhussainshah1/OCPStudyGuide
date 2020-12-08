package ocp11.ch15.advance;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

public class Mapping {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

        Map<Integer, Optional<Character>> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                (String s) -> s.charAt(0),//downstream collector
                                Collectors.minBy((a, b) -> a - b))));//downstream collector
        System.out.println(map); // {5=Optional[b], 6=Optional[t]}

        //or
        ohMy = Stream.of("lions", "tigers", "bears");
        map = ohMy.collect(
                groupingBy(
                        String::length,
                        mapping((String s) -> s.charAt(0),
                                minBy((a, b) -> a - b))));
        System.out.println(map); // {5=Optional[b], 6=Optional[t]}
    }
}
