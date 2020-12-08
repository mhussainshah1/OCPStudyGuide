package ocp11.ch07.pond.inland;// different package than Bird

import ocp11.ch07.pond.shore.Bird;

public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // DOES NOT COMPILE
        System.out.println(bird.text); // DOES NOT COMPILE
    }
}
