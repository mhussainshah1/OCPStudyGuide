package ocp8.ch03.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Compute {

    public static void main(String[] args) {
        //computeIfPresent()
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);
        BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
        Integer jenny = counts.computeIfPresent("Jenny", mapper);
        Integer sam = counts.computeIfPresent("Sam", mapper);
        System.out.println(counts); // {Jenny=2}
        System.out.println(jenny); // 2
        System.out.println(sam); // null
        
        //computeIfAbsent()
        Map<String, Integer> counts1 = new HashMap<>();
        counts1.put("Jenny", 15);
        counts1.put("Tom", null);
        Function<String, Integer> mapper1 = (k) -> 1;
        jenny = counts1.computeIfAbsent("Jenny", mapper1); // 15
        sam = counts1.computeIfAbsent("Sam", mapper1); // 1
        Integer tom = counts1.computeIfAbsent("Tom", mapper1); // 1
        System.out.println(counts1); // {Tom=1, Jenny=15, Sam=1}

        Map<String, Integer> counts2 = new HashMap<>();
        counts2.put("Jenny", 1);
        counts2.computeIfPresent("Jenny", (k, v) -> null);
        counts2.computeIfAbsent("Sam", k -> null);
        System.out.println(counts); // {}
    }
}
