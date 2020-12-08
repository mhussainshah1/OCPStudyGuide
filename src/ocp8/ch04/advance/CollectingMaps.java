package ocp8.ch04.advance;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingMaps {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map 
                = ohMy.collect(Collectors.toMap(s -> s, 
                                                String::length)); // s -> s or Function.identity()
        System.out.println(map); // {lions=5, bears=5, tigers=6}

        //reverse key into values
        ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map1
                = ohMy.collect(Collectors.toMap(String::length, 
                                                k -> k, 
                                                (s1, s2) -> s1 + "," + s2));
        System.out.println(map1); // {5=lions,bears, 6=tigers}
        System.out.println(map1.getClass()); // class java.util.HashMap

        ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map2
                = ohMy.collect(Collectors.toMap(String::length,
                                                k -> k,
                                                (s1, s2) -> s1 + "," + s2,
                                                TreeMap::new));
        System.out.println(map2); // // {5=lions,bears, 6=tigers}
        System.out.println(map2.getClass()); // class java.util.TreeMap
    }
}
