package ocp11.ch09.abstractclass;

abstract class Mammal {

    abstract void showHorn();

    abstract void eatLeaf();
}

abstract class Rhino extends Mammal {

    void showHorn() {
    }
}

public class BlackRhino extends Rhino {

    void eatLeaf() {
    }
}