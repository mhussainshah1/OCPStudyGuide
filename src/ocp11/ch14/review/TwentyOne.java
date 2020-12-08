package ocp11.ch14.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TwentyOne {

    public static void main(String[] args) {
        var map = Map.of(1, 2, 3, 6);//Map<Integer, Integer>
        var list = List.copyOf(map.entrySet());

        List<Integer> one = List.of(8, 16, 2);
        var copy = List.copyOf(one);
        var copyOfCopy = List.copyOf(copy);
        var thirdCopy = new ArrayList<>(copyOfCopy);

        list.replaceAll(x -> x * 2);
        one.replaceAll(x -> x * 2);//UnsupportedOperationException: 
        thirdCopy.replaceAll(x -> x * 2);

        System.out.println(thirdCopy);

    }
}
