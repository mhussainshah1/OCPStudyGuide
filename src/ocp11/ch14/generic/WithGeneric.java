package ocp11.ch14.generic;

import java.util.ArrayList;
import java.util.List;

public class WithGeneric {

    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // class cast exception here
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add(new StringBuilder("Webby")); // DOES NOT COMPILE
        printNames(names);
    }
}