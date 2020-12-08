package ocp11.ch09.interfaces;

interface Nocturnal1 {

    public int hunt();
}

interface CanFly {

    public void flap();
}

interface HasBigEyes1 extends Nocturnal1, CanFly {
}

public class Owl implements Nocturnal, CanFly {

    public int hunt() {
        return 5;
    }

    public void flap() {
        System.out.println("Flap!");
    }
}
