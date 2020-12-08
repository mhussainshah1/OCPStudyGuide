package ocp11.ch07.review;

import java.util.ArrayList;
import java.util.List;

public class TwentyEight {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.removeIf(s -> s.isEmpty());
        list.removeIf(s -> {
            return s.isEmpty();
        });
        list.removeIf((String s) -> s.isEmpty());
    }
}
