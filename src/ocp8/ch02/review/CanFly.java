package ocp8.ch02.review;

public interface CanFly {

    void fly();
}

interface HasWings {

    public abstract Object getWingSpan();
}

abstract class Falcon implements CanFly, HasWings {
}