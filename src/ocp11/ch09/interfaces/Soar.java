package ocp11.ch09.interfaces;

interface Soar1 {

    int MAX_HEIGHT = 10;
    final static boolean UNDERWATER = true;

    void fly(int speed);

    abstract void takeoff();

    public abstract double dive();
}

public abstract interface Soar {

    public static final int MAX_HEIGHT = 10;
    public final static boolean UNDERWATER = true;

    public abstract void fly(int speed);

    public abstract void takeoff();

    public abstract double dive();
}
