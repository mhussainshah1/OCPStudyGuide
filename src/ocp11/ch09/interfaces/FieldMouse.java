package ocp11.ch09.interfaces;

abstract interface CanBarrow {

    public abstract Float getSpeed(int age);
    public static final int MINIMUM_DEPT = 2;
}

interface Climb {

    Number getSpeed(int age);
}

public class FieldMouse implements Climb, CanBarrow {

    @Override
    public Float getSpeed(int age) {
        return 11f;
    }

}
