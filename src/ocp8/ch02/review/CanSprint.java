package ocp8.ch02.review;

interface CanWalk {

    default void walk() {
        System.out.println("Walking");
    }
}

interface CanRun {

    public default void walk() {
        System.out.println("Walking");
    }

    public abstract void run();
}

public interface CanSprint extends CanWalk, CanRun {

    void sprint();
}
