package ocp11.ch09.abstractclass;

abstract class Whale {

    private abstract void sing(); // DOES NOT COMPILE
}

public class HumpbackWhale extends Whale {

    private void sing() {
        System.out.println("Humpback whale is singing");
    }
}
