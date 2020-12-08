package ocp11.ch10.MethosThrowException;

class NoMoreCarrotsException1 extends Exception {
}

public class Bunny1 {

    public static void main(String[] args) throws NoMoreCarrotsException1 {// declare exception
        eatCarrot();
    }

    private static void eatCarrot() throws NoMoreCarrotsException1 {
    }
}
