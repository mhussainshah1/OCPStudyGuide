package ocp11.ch10.MethosThrowException;

class NoMoreCarrotsException3 extends Exception {
}

public class Bunny3 {

    public void bad() {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException3 e) {// DOES NOT COMPILE
            System.out.print("sad rabbit");
        }
    }

    public void good() throws NoMoreCarrotsException3 {
        eatCarrot();
    }

    private static void eatCarrot() {
    }
}
