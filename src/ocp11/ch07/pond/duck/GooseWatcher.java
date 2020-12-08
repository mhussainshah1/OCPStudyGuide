package ocp11.ch07.pond.duck;

import ocp11.ch07.pond.goose.Goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE
    }
}
