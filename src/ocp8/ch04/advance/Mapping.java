package ocp8.ch04.advance;

import java.util.Comparator;
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
                        Collectors.mapping((String s) -> s.charAt(0),//downstream collector
                                Collectors.minBy(Comparator.naturalOrder()))));//downstream collector
         System.out.println(map); // {5=Optional[b], 6=Optional[t]}

        //or
        ohMy = Stream.of("lions", "tigers", "bears");
        map = ohMy.collect(
                groupingBy(
                        String::length,
                        mapping((String s) -> s.charAt(0),
                                minBy(Comparator.naturalOrder()))));
        System.out.println(map); // {5=Optional[b], 6=Optional[t]}
    }
}
