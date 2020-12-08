package ocp11.ch08.inheritance;

class Bird2 {

    private final boolean hasFeathers() {
        return true;
    }

    private final static void flyAway() {
    }
}

public class Penguin1 extends Bird2 {

    public final boolean hasFeathers() {
        return false;
    }

    public final static void flyAway() {
    }
}
