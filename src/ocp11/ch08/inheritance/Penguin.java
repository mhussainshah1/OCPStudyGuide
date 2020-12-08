package ocp11.ch08.inheritance;

class Bird1 {

    public final boolean hasFeathers() {
        return true;
    }

    public final static void flyAway() {
    }
}

public class Penguin extends Bird1 {

    public final boolean hasFeathers() { // DOES NOT COMPILE
        return false;
    }

    public final static void flyAway() {
    } // DOES NOT COMPILE
}
