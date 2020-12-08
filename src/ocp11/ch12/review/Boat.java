package ocp11.ch12.review;

@FunctionalInterface
interface Transport {
    public int go();
    public boolean equals(Object o);
}

@FunctionalInterface
abstract class Car {
    public abstract Object swim(double speed, int duration);
}

@FunctionalInterface
interface Locomotive extends Train {
    public int getSpeed();
}

@FunctionalInterface
interface Train extends Transport {
}

@FunctionalInterface
abstract interface Spaceship extends Transport {
    default int blastOff();
}

@FunctionalInterface
public interface Boat {
    int hashCode();
    int hashCode(String input);
}