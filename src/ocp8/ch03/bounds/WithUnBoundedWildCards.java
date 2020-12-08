package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;

public class WithUnBoundedWildCards {
    public static void printList(List<?> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }
    
     public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
     }
}
