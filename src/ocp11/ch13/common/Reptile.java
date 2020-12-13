package ocp11.ch13.common;

@FunctionalInterface
interface Intelligence {
    int cunning();
}

@FunctionalInterface
abstract class Reptile {
    abstract String getName();
}

@FunctionalInterface
interface Slimy {
}

@FunctionalInterface
interface Scaley {
    boolean isSnake();
}

@FunctionalInterface
interface Rough extends Scaley {
    void checkType();
}

@FunctionalInterface
interface Smooth extends Scaley {
    boolean equals(Object unused);
}
