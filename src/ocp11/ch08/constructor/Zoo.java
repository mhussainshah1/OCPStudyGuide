package ocp11.ch08.constructor;

public class Zoo extends Object{

    public Zoo() {
        super();
        System.out.println("Zoo created");
        super(); // DOES NOT COMPILE
    }
}
