package ocp11.ch14.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MyMap {

    public static void main(String[] args) {

        //of() , ofEntries() and copyOf()
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        //class java.util.ImmutableCollections$MapN
//        Map.of("key1", "value1", "key2"); // INCORRECT       

        Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value1"));

        Map<String, String> copy = Map.copyOf(map);

        //HashMap
        map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet()) {
            System.out.print(key + ","); // koala,giraffe,lion,
        }

        //TreeMap
        map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        food = map.get("koala"); // bamboo
        for (String key : map.keySet()) {
            System.out.print(key + ","); // giraffe,koala,lion,
        }
        for (String value : map.values()) {
            System.out.print(value + ","); // leaf,bamboo,meat,
        }

//        System.out.println(map.contains("lion")); // DOES NOT COMPILE
        System.out.println(map.containsKey("lion")); // true
        System.out.println(map.containsValue("lion")); // false
        System.out.println(map.size()); // 3
        map.clear();
        System.out.println(map.size()); // 0
        System.out.println(map.isEmpty()); // true

        //forEach() and entrySet()
        Map<Integer, Character> map1 = new HashMap<>();
        map1.put(1, 'a');
        map1.put(2, 'b');
        map1.put(3, 'c');
        map1.forEach((k, v) -> System.out.println(v));
        map.values().forEach(System.out::println);
        map.entrySet().forEach(e -> System.out.println(e.getKey() + e.getValue()));

        //get() and getOrDefault()
        Map<Character, String> map2 = new HashMap<>();
        map2.put('x', "spot");
        System.out.println("X marks the " + map2.get('x'));
        System.out.println("X marks the " + map2.getOrDefault('x', ""));
        System.out.println("Y marks the " + map2.get('y'));
        System.out.println("Y marks the " + map2.getOrDefault('y', ""));

        //replace() and replaceAll()
        Map<Integer, Integer> map3 = new HashMap<>();
        map3.put(1, 2);
        map3.put(2, 4);
        Integer original = map3.replace(2, 10); // 4
        System.out.println(map3); // {1=2, 2=10}
        map3.replaceAll((k, v) -> k + v);
        System.out.println(map3); // {1=3, 2=12}

        //putIfAbsent()
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
        
        //merge()
         BiFunction<String, String, String> mapper
                = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        //Merge replace the "value" if pass the logic
        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny); // Bus Tour
        System.out.println(tom); // Skyride

        //merge do not call BiFunction if "value" is null or missing "key"
        mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        favorites = new HashMap<>();
        favorites.put("Sam", null);

        favorites.merge("Tom", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);

        System.out.println(favorites); // {Tom=Skyride, Sam=Skyride}
        
        //merge will remove the "key" if BiFunction returns null 
        mapper = (v1, v2) -> null;
        favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");
        favorites.merge("Jenny", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);
        System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}
    }
}
