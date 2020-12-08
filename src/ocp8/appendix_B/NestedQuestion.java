package ocp8.appendix_B;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NestedQuestion {

    public static void main(String[] args) {
        List<Integer> list1 = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = Collections.synchronizedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        for (Integer item : list1) {
            list1.add(5);
        }
        for (Integer item : list2) {
            list2.remove(0);
        }
        System.out.println(list1.size() + " " + list2.size());
    }
}
