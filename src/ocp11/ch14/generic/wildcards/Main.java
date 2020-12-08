package ocp11.ch14.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

class GrandParent {}
class Parent extends GrandParent {}
class Child extends Parent {}

public class Main {

    public static void main(String[] args) {
        //Generic - Exact Match
        List<GrandParent> obj = new ArrayList<GrandParent>();
        
//        List<GrandParent> obj = new ArrayList<Parent>();

        //Wildcard
        //Unbounded (?) - Immutable List
        List<?> obj1 = new ArrayList<Parent>();//hold instace of any list
                
                obj1.add(new Object());
                obj1.add(new Parent());
                obj1.add(new Child());

        //Upper bound (? extends type) - hold instance of list of own type and subtype
        //Immutable List
        List<? extends GrandParent> //obj2 = new ArrayList<Object>();//Error
                                    //obj2 = new ArrayList<GrandParent>();
                                    obj2 = new ArrayList<Parent>();
                                    //obj2 = new ArrayList<Child>();  
                                    
                                    obj2.add(new Object());
                                    obj2.add(new GrandParent());
                                    obj2.add(new Parent());
                                    obj2.add(new Child());

        //Lower bound (? super type) - hold own and super-types
        //Mutable List
        List<? super Parent> //obj3 = new ArrayList<Object>();
                             obj3 = new ArrayList<GrandParent>();
                             //obj3 = new ArrayList<Parent>();
                             //obj3 = new ArrayList<Child>(); //Error
                             
                            obj3.add(new Object());
                            obj3.add(new GrandParent());
                            obj3.add(new Parent());
                            obj3.add(new Child());
    }
}
