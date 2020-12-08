package ocp11.ch14.review;

import java.util.List;

public class Three {

    public static void main(String[] args) {
        List<?> q = List.of("mouse", "parrot");//List<Object>
        var v = List.of("mouse", "parrot");//List<String>

        q.removeIf(String::isEmpty);
        q.removeIf(s -> s.length() == 4);
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);
    }
}
