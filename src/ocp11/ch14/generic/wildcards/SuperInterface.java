package ocp11.ch14.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public interface SuperInterface {}

interface Interface extends SuperInterface {}

class MyClass implements Interface {
    
    public static void main(String[] args) {
        
        List<? extends Interface> //test = new ArrayList<SuperInterface>();
                                       test = new ArrayList<Interface>();
                                       test = new ArrayList<MyClass>();
                                
        List<? super MyClass> test2 = new ArrayList<MyClass>();                              
                              test2 = new ArrayList<Interface>();
                              test2 = new ArrayList<SuperInterface>();                              
    }
}