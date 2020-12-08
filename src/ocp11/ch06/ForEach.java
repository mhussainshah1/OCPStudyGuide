package ocp11.ch06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEach {

    public static void main(String[] args) {
        //List
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        bunnies.forEach(b -> System.out.println(b));
        System.out.println(bunnies);

        //Set
        Set<String> bunniesSet = Set.of("long ear", "floppy", "hoppy");
        bunniesSet.forEach(b -> System.out.println(b));

        //Map
        Map<String, Integer> bunniesMap = new HashMap<>();
        bunniesMap.put("long ear", 3);
        bunniesMap.put("floppy", 8);
        bunniesMap.put("hoppy", 1);
        bunniesMap.keySet().forEach(b -> System.out.println(b));//forEach (Consumer c)
        bunniesMap.values().forEach(b -> System.out.println(b));
        
        bunniesMap.forEach((k, v) -> System.out.println(k + " " + v));//forEach (BiConsumer b)
    }
}
