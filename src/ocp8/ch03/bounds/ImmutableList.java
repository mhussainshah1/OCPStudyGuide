package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;

class Bird {
}

class Sparrow extends Bird {
}

public class ImmutableList {
    public static void main(String[] args) {
        //Mutable List
        List<Bird> birds1 = new ArrayList<Bird>();
        birds1.add(new Sparrow()); 
        birds1.add(new Bird()); 
        birds1 = new ArrayList<Sparrow>();
        
        //Immutable List
        List<? extends Bird> birds2 = new ArrayList<Bird>();
        birds2.add(new Sparrow()); // DOES NOT COMPILE
        birds2.add(new Bird()); // DOES NOT COMPILE      
        birds2 = new ArrayList<Sparrow>();
    }
}