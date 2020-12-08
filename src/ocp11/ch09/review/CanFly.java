package ocp11.ch09.review;

public interface CanFly {

    int fly();
    String fly(int distance);
}
interface HasWings {

    abstract String fly();

    public abstract Object getWingSpan();
}

abstract class Falcon implements CanFly, HasWings {
}
