package ocp8.ch03.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListAndArray {

    public static void main(String[] args) {
        String[] array = {"gerbil", "mouse"};       // [gerbil, mouse]

        //array to list
        List<String> list = Arrays.asList(array);   // returns fixed size list
        Set<String> set = list.stream()
                              .collect(Collectors.toSet());
        list.set(1, "test");                        // [gerbil, test]
        array[0] = "new";                           // [new, test]

        //list to array
        Object[] array2 = list.toArray();// [new, test]
        for(Object obj: array2){
            System.out.print(obj+ "-");
        }
     //   list.remove(1);                             // throws UnsupportedOperationException
    }
}
