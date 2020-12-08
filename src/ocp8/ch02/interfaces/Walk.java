package ocp8.ch02.interfaces;

public interface Walk {

    boolean isQuadruped();

    abstract double getMaxSpeed();
}

interface Run extends Walk {

    public abstract boolean canHuntWhileRunning();

    @Override
    abstract double getMaxSpeed();
}

class Lion implements Run {

    @Override
    public boolean isQuadruped() {
        return true;
    }

    @Override
    public boolean canHuntWhileRunning() {
        return true;
    }

    @Override
    public double getMaxSpeed() {
        return 100;
    }
}
