package ocp11.ch14.generic.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBound {

    public static void main(String[] args) {
//        List<Number> list1 = new ArrayList<Integer>(); // DOES NOT COMPILE
        List<? extends Number> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(total(list2));
    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }
        return count;
    }
    /*
     * Java converts the code into following
      public static long total(List list) { 
           long count = 0; 
           for (Object obj:list) { 
               Number number = (Number) obj; 
               count += number.longValue(); 
           }
           return count; 
      }
    */
}