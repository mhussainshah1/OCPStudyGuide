package ocp8.ch03.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD"); // [SD]
        list.add(0, "NY"); // [NY,SD]
        System.out.println(list.set(1, "FL")); // [NY,FL]
        list.remove("NY"); // [FL]
        list.remove(0); // []

        list.add("OH"); // [OH]
        list.add("CO"); // [OH,CO]
        list.add("NJ"); // [OH,CO,NJ]
        String state = list.get(0); // OH
        int index = list.indexOf("NJ"); // 2

        for (String string : list) {
            System.out.println(string);
        }

        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            String string = (String) iter.next();
            System.out.println(string);
        }

        Iterator<String> iter1 = list.iterator();
        while (iter1.hasNext()) {
            String string = iter1.next();
            System.out.println(string);
        }
    }
}