package ocp11.ch09.interfaces;

interface LongEars {
    int softSkin();
}

interface LongNose {
    void softSkin();
}

interface Donkey extends LongEars, LongNose {
} // DOES NOT COMPILE

abstract class Aardvark implements LongEars, LongNose {
}// DOES NOT COMPILE
