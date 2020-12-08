
package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;


public class ArrayVsArrayList {
    public static void main(String[] args) {
        //Arrays vs. ArrayList
        //Generic ArrayList  gives compiler error
        List<Object> l = new ArrayList<String>();// DOES NOT COMPILE: ArrayList<String> cannot be assigned to List<Object>.
        
        //Array gives runtime error
        Object[] o = new String[0];
        Integer[] numbers1 = {new Integer(42)};
        Object[] objects1 = numbers1;
        objects1[0] = "forty two"; // throws ArrayStoreException
    }
}
