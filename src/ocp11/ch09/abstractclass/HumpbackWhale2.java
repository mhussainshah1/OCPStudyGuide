package ocp11.ch09.abstractclass;

abstract class Whale1 {

     protected abstract void sing(); // DOES NOT COMPILE
}

public class HumpbackWhale2 extends Whale1 {

    private void sing() {
        System.out.println("Humpback whale is singing");
    }
}
