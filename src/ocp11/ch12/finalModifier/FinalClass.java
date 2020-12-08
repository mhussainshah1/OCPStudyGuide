package ocp11.ch12.finalModifier;

final class Reptile {
}

class Snake extends Reptile {
}  // DOES NOT COMPILE

abstract final class Eagle {
}  // DOES NOT COMPILE

final interface Hawk {
}        // DOES NOT COMPILE
