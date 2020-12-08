package ocp11.ch09.interfaces;

public interface Dance {

    private int count = 4; // DOES NOT COMPILE

    protected void step(); // DOES NOT COMPILE
}
