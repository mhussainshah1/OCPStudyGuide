package ocp8.ch03.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Merge {

    public static void main(String[] args) {
        
        BiFunction<String, String, String> mapper
                = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        //Merge replave the "value" if pass the logic
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
