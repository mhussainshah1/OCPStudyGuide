package ocp8.ch03.java8;

import java.util.Arrays;
import java.util.List;

public class Loop {

    public static void main(String[] args) {
        List<String> cats = Arrays.asList("Annie", "Ripley");
        for (String cat : cats) {
            System.out.println(cat);
        }
        
        cats.forEach(c -> System.out.println(c));
        
        cats.forEach(System.out::println);
    }
}