package ocp11.ch10.MethosThrowException;

class NoMoreCarrotsException2 extends Exception {
}

public class Bunny2 {

    public static void main(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException2 e) {// handle exception
            System.out.print("sad rabbit");
        }
    }

    private static void eatCarrot() throws NoMoreCarrotsException2 {
    }
}
