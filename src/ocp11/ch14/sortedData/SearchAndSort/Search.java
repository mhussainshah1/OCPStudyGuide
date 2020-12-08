package ocp11.ch14.sortedData.SearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Search {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c1 = Comparator.naturalOrder();//.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", c1);
        System.out.println(index);
    }
}
