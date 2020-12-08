package ocp8.ch02.interfaces;

public interface Fly {

    public int getWingSpan() throws Exception;
    public static final int MAX_SPEED = 100;

    public default void land() {
        System.out.println("Animal is landing");
    }

    public static double calculateSpeed(float distance, double time) {
        return distance / time;
    }
}

class Eagle implements Fly {

    @Override
    public int getWingSpan() {
        return 15;
    }

    @Override
    public void land() {
        System.out.println("Eagle is diving fast");
    }
}
