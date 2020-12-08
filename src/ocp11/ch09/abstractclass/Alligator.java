package ocp11.ch09.abstractclass;

abstract class Alligator {

    public static void main(String... food) {
        var a = new Alligator(); // DOES NOT COMPILE
        var b = new Alligator() {};
    }
}