package ocp11.ch06.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Ten {

    public static void main(String[] args) {
        Set<String> set = Set.of("mickey", "minnie");
        List<String> list = new ArrayList<>(set);
        set.forEach(s -> System.out.println(s));
        list.forEach(s -> System.out.println(s));
    }
}
