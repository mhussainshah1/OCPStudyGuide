package ocp11.ch07.pond.shore;

import ocp11.ch07.pond.goose.Goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE
    }
}
