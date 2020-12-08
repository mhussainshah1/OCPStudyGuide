package ocp11.ch08.review;

import java.util.ArrayList;
import java.util.List;

public class Llama {

    void friendly(List<String> laugh, Iterable<Short> s) {
    }
}

class Child extends Llama {

//    void friendly(List<CharSequence> laugh, Iterable<Short> s) {
//    }

    @Override
    void friendly(List<String> laugh, Iterable<Short> s) {
    }

//    void friendly(ArrayList<String> laugh, Iterable<Short> s) {
//    }
//
//    void friendly(List<String> laugh, Iterable<Integer> s) {
//    }
//
//    void friendly(ArrayList<CharSequence> laugh, Object s) {
//    }
//
//    void friendly(ArrayList<String> laugh, Iterable... s) {
//    }
}
