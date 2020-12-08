package ocp11.ch14.generic.wildcards;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Immutable_MutableList {

    static class Bird {
    }

    static class Sparrow extends Bird {
    }
    
    static class Chick extends Sparrow{
        
    }

    public static void main(String[] args) {
        //Immutable List
        List<? extends Bird> birds1 = new ArrayList<Bird>();
        birds1.add(new Sparrow()); // DOES NOT COMPILE
        birds1.add(new Bird()); // DOES NOT COMPILE             
                             birds1 = new ArrayList<Sparrow>();

        //Mutable List
        List<? super Sparrow> birds2 = new ArrayList<Bird>();
        birds2.add(new Sparrow());
        birds2.add(new Bird());
                              birds2 = new ArrayList<Sparrow>();

        List<? super IOException> exceptions = new ArrayList<Exception>();
        exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
                                  exceptions = new ArrayList<IOException>();
                                  exceptions = new ArrayList<Throwable>();
                                  exceptions = new ArrayList<Object>();
    }
}
