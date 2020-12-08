package ocp11.ch14.review;

import java.util.HashMap;
import java.util.Map;

public class Nine {

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.add("pi", 3.14159);
        map.add("e", 2L);
        map.add("log(1)", new Double(0.0));
        map.add('x', new Double(123.4));
    }
}
