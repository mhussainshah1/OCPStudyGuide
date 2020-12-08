package ocp11.ch15.review;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seven {

    public static void main(String[] args) {
        var list = Arrays.asList("I", "Love", "you");
        System.out.println(sort(list));
    }

    private static List<String> sort(List<String> list) {
        return list
                .stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

//        var copy = new ArrayList<>(list);
//        Collections.sort(copy, (a, b) -> b.compareTo(a));
//        return copy;
    }
}
