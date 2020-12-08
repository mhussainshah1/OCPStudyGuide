package ocp8.ch03.collection;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        for (Integer integer : set) {
//            System.out.print(integer + ","); // 66,8,10,
        }

        set = new HashSet<>();
        b1 = set.add(66); // true
        b2 = set.add(10); // true
        b3 = set.add(66); // false
        b4 = set.add(8); // true
        for (Integer integer : set) {
//            System.out.print(integer + ","); // 8,10,66,
        }

        NavigableSet<Integer> set1 = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            set1.add(i);
        }
        System.out.println(set1.lower(10)); // 9
        System.out.println(set1.floor(10)); // 10
        System.out.println(set1.ceiling(20)); // 20
        System.out.println(set1.higher(20)); // null
    }
}
