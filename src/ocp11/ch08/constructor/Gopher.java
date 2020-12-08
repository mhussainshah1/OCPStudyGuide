package ocp11.ch08.constructor;

public class Gopher {

    public Gopher() {
        this(5); // DOES NOT COMPILE
    }

    public Gopher(int dugHoles) {
        this(); // DOES NOT COMPILE
    }
}
