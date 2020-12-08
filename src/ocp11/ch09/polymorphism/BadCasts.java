package ocp11.ch09.polymorphism;

interface Canine {
}

class Dog implements Canine {
}

class Wolf implements Canine {
}

public class BadCasts {

    public static void main(String[] args) {
        Canine canine = new Wolf();
        Canine badDog = (Dog) canine;//Runtime Exception: java.lang.ClassCastException:
        Object badDog = (String)canine; // DOES NOT COMPILE
    }
}
