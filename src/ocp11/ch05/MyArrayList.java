package ocp11.ch05;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //initial capacity = 10
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        list1.size();

        ArrayList<String> list4 = new ArrayList<String>();//Java 5
        ArrayList<String> list5 = new ArrayList<>();//Java 7

        /**
         * you can store an ArrayList in a List reference variable but not vice
         * versa. List is an interface and interfaces can’t be instantiated
         */
        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE
        //Using var with ArrayList
        var strings = new ArrayList<String>();
        strings.add("a");
        for (String string : strings) {
            
        }
        
        var list = new ArrayList<>();
        list.add("a");
//        for (String s : list) {} //DOES NOT COMPILE      
    
    }
}
