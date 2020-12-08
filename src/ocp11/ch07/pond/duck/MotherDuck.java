package ocp11.ch07.pond.duck;

public class MotherDuck {

    String noise = "quack";

    void quack() {
        System.out.println(noise); // default access is ok
    }

    private void makeNoise() {
        quack(); // default access is ok
    }
}
