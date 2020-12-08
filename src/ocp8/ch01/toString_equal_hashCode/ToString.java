package ocp8.ch01.toString_equal_hashCode;

import java.util.ArrayList;

public class ToString {

    public static void main(String[] args) {
        System.out.println(new ArrayList()); // []
        System.out.println(new String[0]); // [Ljava.lang.String;@4e50df2e
    }
}
