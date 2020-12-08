package ocp11.ch06.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Eighteen {

    public static void main(String[] args) {
        Set<String> s = Set.of("mickey", "minnie");
        List<String> x = new ArrayList<>(s);
        s.forEach(s -> System.out.println(s));
        x.forEach(x -> System.out.println(x));
    }
}
