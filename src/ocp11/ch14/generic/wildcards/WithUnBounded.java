package ocp11.ch14.generic.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithUnBounded {

    public static void printList(List<?> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);

        List<?> x1 = new ArrayList<>(Arrays.asList(new Object()));//List<Object>
        System.out.println(x1.get(0));
        
        var x2 = new ArrayList<>();//ArrayList<Object>
        List<Object> objects = x2;
        objects.add(new Object());
        System.out.println(x2.get(0));
    }
}
