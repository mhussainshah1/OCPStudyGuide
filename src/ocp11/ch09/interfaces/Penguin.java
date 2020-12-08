package ocp11.ch09.interfaces;

interface Dances {

    String swingArms();
}

interface EatsFish {

    CharSequence swingArms();
}

public class Penguin implements Dances, EatsFish {

    public String swingArms() {
        return "swing!";
    }
}
