package ocp8.ch04.advance;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

    public static void main(String[] args) {
        // Map value is List
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map
                = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
        
        // Map value is set
        ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map1 
                = ohMy.collect(Collectors.groupingBy(String::length, 
                                                     Collectors.toSet()));
        System.out.println(map1); // {5=[lions, bears], 6=[tigers]}

        //change the return type to TreeMap
        ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map2 
                = ohMy.collect(Collectors.groupingBy(String::length,
                                                     TreeMap::new, 
                                                     Collectors.toSet()));
        System.out.println(map2); // {5=[lions, bears], 6=[tigers]}

        ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map3 
                = ohMy.collect(Collectors.groupingBy(String::length, 
                                                     TreeMap::new, 
                                                     Collectors.toList()));
        System.out.println(map3);
    }
}
