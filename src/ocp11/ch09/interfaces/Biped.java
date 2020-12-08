package ocp11.ch09.interfaces;

public class Biped {

    public static void main(String[] args) {
        var e = new WalksOnTwoLegs(); // DOES NOT COMPILE
    }
}

public final interface WalksOnEightLegs {
} // DOES NOT COMPILE
