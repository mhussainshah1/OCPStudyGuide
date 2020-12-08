package ocp11.ch14.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Bounds {

    public static void main(String[] args) {
        //Unbounded wildcard (?)
        List<?> a = new ArrayList<String>();
        
        //Upper bound Wildcard (? extends type)
        List<? extends Exception> a1 = new ArrayList<RuntimeException>();
        
        //Lower bound Wildcard (? super type)
        List<? super Exception> a2 = new ArrayList<Object>();
        
    }
}