package ocp11.ch14.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);
    }
    /*
    public static void addSound(List<?> list) {
//        list.add("quack");//Do Not Compile: unbounded generics are immutable
    }
     */   
    /*     
    public static void addSound(List<? extends Object> list) {
//        list.add("quack");//Do Not Compile: upper bounded generics are immutable
    }
    */

    /*
    //cant pass List<String>
    public static void addSound(List<Object> list) {
        list.add("quack");
    }
    */
    public static void addSound(List<? super String> list) {    // lower bound
        list.add("quack");
    }
}
