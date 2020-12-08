package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;

public class Bounds {

    public static void main(String[] args) {
        //Unbounded wildcard (?)
        List<?> l = new ArrayList<String>();
        
        //Wildcard with an upper bound (? extends type)
        List<? extends Exception> lu = new ArrayList<RuntimeException>();
        
        //Wildcard with a lower bound (? super type)
        List<? super Exception> lb = new ArrayList<Object>();
    }
}