package ocp8.ch03.SearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Search {

    public static void main(String[] args) {
        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c1 = Comparator.naturalOrder();//.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c1);
        System.out.println(index);
    }
}
