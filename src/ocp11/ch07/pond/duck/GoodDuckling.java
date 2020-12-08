package ocp11.ch07.pond.duck;

public class GoodDuckling {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access
        System.out.println(duck.noise); // default access
    }
}
