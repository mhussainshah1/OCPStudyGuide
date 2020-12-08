package ocp11.ch05;

import java.util.Set;
import java.util.HashSet;

public class Sets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66)); // true
        System.out.println(set.add(66)); // false
        System.out.println(set.size()); // 1
        set.remove(66);
        System.out.println(set.isEmpty()); // true
    }

}
