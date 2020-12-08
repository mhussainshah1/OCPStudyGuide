package ocp8.ch03.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class NullWithMerge {

    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        favorites.put("Sam", null);

        BiFunction<String, String, String> mapper = (v1, v2) -> null;
        BiFunction<String, String, String> mapper1
                = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        favorites.merge("Sam", "Bruce", mapper); //update key's value in the map
        favorites.merge("Sam", "Michael", mapper1); //Set key to value
        favorites.merge("Jenny", "Am track", mapper); //remove key from map
        favorites.merge("Jenny", "Am track", mapper1);//set key to mapping function result
        favorites.merge("Amir", "Plane", mapper); //add key to map
        favorites.merge("Mo", "Ship", mapper1); //add key to map
        System.out.println(favorites);

        favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        favorites.put("Sam", null);
        
        Function<String, String> mapper2 = k -> null;
        Function<String, String> mapper3 = k -> "America track";

        favorites.computeIfAbsent("Sam", mapper2); //Do not Change the map
        favorites.computeIfAbsent("Sam", mapper3); //Set key to mapping function result
        favorites.computeIfAbsent("Jenny", mapper2); //Do not Change the map
        favorites.computeIfAbsent("Jenny", mapper3); //Do not Change the map
        favorites.computeIfAbsent("Amir", mapper2);//Do not Change the map
        favorites.computeIfAbsent("Mo", mapper3);//Add key to map with mapping function result as value
        System.out.println(favorites);
        
        favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        favorites.put("Sam", null);

        favorites.computeIfPresent("Sam", mapper);//Do not Change the map
        favorites.computeIfPresent("Sam", mapper1);//Do not Change the map
        favorites.computeIfPresent("Jenny", mapper);//remove key from map
        favorites.put("Jenny", "Bus Tour");
        favorites.computeIfPresent("Jenny", mapper1);//set key to mapping function result
        favorites.computeIfPresent("Amir", mapper);//Do not Change the map
        favorites.computeIfPresent("Mo", mapper1);//Do not Change the map
        System.out.println(favorites);
    }
}