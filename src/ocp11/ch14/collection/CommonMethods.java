package ocp11.ch14.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonMethods {

    public static void main(String[] args) {
        //add()
        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false

        //remove()
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk")); // true
        System.out.println(birds); // [hawk]
//        System.out.println(birds.remove(100));//IndexOutOfBoundsException

        birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        birds.add("hawk");
        /*
        for (String bird : birds){ // ConcurrentModificationException        
            birds.remove(bird);
        }*/

        //isEmpty(), size()
        birds = new ArrayList<>();
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2

        //clear()
        birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
        birds.clear(); // []
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0

        //contains()
        birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false
        
        //removeIf()
        list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]

        //forEach
        Collection<String> cats = Arrays.asList("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));
    }
}
