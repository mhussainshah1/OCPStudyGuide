package ocp11.ch05.reviews;

import java.util.ArrayList;
import java.util.HashSet;

public class Eighteen {

    public static void main(String[] args) {
        var values = new ArrayList<Integer>();
        values.add(4);
        values.add(4);
//        values.set(1, 6);
//        values.remove(0);
        for (var v : values) {
            System.out.print(v);
        }
    }

}
