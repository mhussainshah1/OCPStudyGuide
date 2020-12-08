package ocp8.ch03.bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcards {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);

        List<? super IOException> exceptions = new ArrayList<Exception>();
        exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }
//
//    public static void addSound(List<?> list) {
//        list.add("quack");
//    }
//    
//    public static void addSound(List<? extends Object> list) {
//        list.add("quack");
//    }
//    
//    public static void addSound(List<Object> list) {
//        list.add("quack");
//    }
//

    public static void addSound(List<? super String> list) {    // lower bound
        list.add("quack");
    }
}
