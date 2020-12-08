package ocp11.ch06.review;

import java.util.List;

public class Fourteen {

    public void remove(List<Character> chars) {
        char end = 'z';
//        char start = 'a';
//        char c = 'x';
        chars = null;
//        end = '1';
        chars.removeIf(c -> {
            char start = 'a';
            return start <= c && c <= end;
        });
    }
}
