package ocp11.ch09.abstractclass;

abstract class Animal {

    public abstract String getName();
}

public class Walrus extends Animal { // DOES NOT COMPILE
}