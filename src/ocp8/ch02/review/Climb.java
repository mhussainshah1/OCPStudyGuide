package ocp8.ch02.review;

public interface Climb {

    public int climb();
}

abstract class Swim {

    public abstract Object swim(double speed, int duration);
}

interface ArcticMountainClimb extends MountainClimb {

    public default int getSpeed();
}

interface MountainClimb extends Climb {
}
