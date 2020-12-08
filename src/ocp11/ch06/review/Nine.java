package ocp11.ch06.review;

import java.util.List;

public class Nine {

    public static void main(String[] args) {

    }

    public void remove(List<Character> chars) {
        char end = 'z';
        chars.removeIf(c -> {
            char start = 'a';
            return start <= c && c <= end;
        });
        char start = 'a';
        char c = 'x';
        chars = null;
       //end = '1';
    }
}
