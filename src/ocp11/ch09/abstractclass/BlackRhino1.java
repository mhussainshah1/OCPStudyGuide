package ocp11.ch09.abstractclass;

abstract class Mammal1 {

    abstract void showHorn();

    abstract void eatLeaf();
}

class Rhino1 extends Mammal1 {

    void showHorn() {
    }
}

public class BlackRhino1 extends Rhino {

    void eatLeaf() {
    }
}