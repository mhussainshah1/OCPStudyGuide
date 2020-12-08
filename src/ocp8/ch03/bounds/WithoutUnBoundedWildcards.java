package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;

public class WithoutUnBoundedWildcards {

    public static void printList(List<Object> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);// DOES NOT COMPILE: List<String> cannot be assigned to List<Object>.
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(42));
        List<Object> objects = numbers;// DOES NOT COMPILE: List<Integer> cannot be assigned to List<Object>.
        objects.add("forty two");
        System.out.println(numbers.get(1));
    }
}