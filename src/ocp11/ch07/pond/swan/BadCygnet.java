package ocp11.ch07.pond.swan;

import ocp11.ch07.pond.duck.MotherDuck;

public class BadCygnet {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // DOES NOT COMPILE
        System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
