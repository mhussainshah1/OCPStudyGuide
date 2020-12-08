package ocp8.ch03.SearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 9, 1, 8);
        Collections.sort(list); // [1, 6, 8, 9]
        System.out.println(Collections.binarySearch(list, 6)); // 1
        System.out.println(Collections.binarySearch(list, 3)); // -2
    }
}
