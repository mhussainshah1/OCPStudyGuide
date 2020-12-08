package ocp11.ch14.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

    public static void main(String[] args) {
        Set<Character> letters = Set.of('z', 'o', 'O');
        Set<Character> copy = Set.copyOf(letters);

        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        set.forEach(System.out::println);

        set = new TreeSet<>();
        b1 = set.add(66); // true
        b2 = set.add(10); // true
        b3 = set.add(66); // false
        b4 = set.add(8); // true
        set.forEach(System.out::println);
    }
}
