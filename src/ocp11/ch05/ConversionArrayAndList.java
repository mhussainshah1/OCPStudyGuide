package ocp11.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionArrayAndList {

    public static void main(String[] args) {
        //List to Array
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);

        list.clear();

        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2

        //Array to List
        //1 - Create a list that is linked to the original array
        String[] array = {"hawk", "robin"}; // [hawk, robin]
        list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) {
            System.out.print(b + " "); // new test
        }
//        list.remove(1); // throws UnsupportedOperation Exception. 
        //we can not change the size of the list.

        //2 - Create an immutable list
        array = new String[]{"hawk", "robin"}; // [hawk, robin]
        list = List.of(array); // returns immutable list
        System.out.println(list.size()); // 2
        array[0] = "new";
        System.out.println(Arrays.toString(array)); // [new, robin]
        System.out.println(list); // [hawk, robin]
//        list.set(1, "test"); // throws UnsupportedOperationException
        //we can not change the value of the list.

        //Varargs
        List<String> list1 = Arrays.asList("one", "two");
        List<String> list2 = List.of("one", "two");

        //fixed to Changeable list
        List<String> expandableList = new ArrayList<>(list1);

        List<String> fixedSizeList = Arrays.asList("a", "b", "c");
        List<String> expandableList1 = new ArrayList<>(fixedSizeList);
    }
}
