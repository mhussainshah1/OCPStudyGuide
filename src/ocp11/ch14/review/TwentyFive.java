package ocp11.ch14.review;

import java.util.HashMap;

public class TwentyFive {

    public static void main(String[] args) {
        var map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, (a, b) -> a + b);
        map.merge(3, 3, (a, b) -> a + b);
        System.out.println(map);
    }
}
