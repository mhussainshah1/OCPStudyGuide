package ocp11.ch09.interfaces;

/**
 * no modifier in class means = package-private
*/ 
abstract class Husky {
    abstract void play();
}

class Webby extends Husky {

    void play() {
    }
}

public interface Poodle {
    /*public abstract*/ void play();
}

class Georgette implements Poodle {
    void play() {
    }
}

class Georgette1 implements Poodle {
    public void play() {
    }
}