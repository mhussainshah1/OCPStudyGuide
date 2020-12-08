package ocp11.ch14.review;

import java.util.HashSet;
import java.util.Iterator;

public class Seven {

    public static void main(String[] args) {
        var numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
    }
}
