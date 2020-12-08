package ocp11.ch06;

import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {
        //natural sort order
        Comparator<Integer> ints = (i1, i2) -> i1 - i2;        
        System.out.println(ints.compare(5, 3));//2
        
        //sort in decending order
        Comparator<String> strings = (s1, s2) -> s2.compareTo(s1);
        System.out.println(strings.compare("a", "A"));//-32
        
        Comparator<String> moreStrings = (s1, s2) -> -s1.compareTo(s2);
        System.out.println(moreStrings.compare("a", "A"));//32
    }
}
