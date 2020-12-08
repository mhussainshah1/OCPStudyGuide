package ocp11.ch10.exceptions;

public class ThrowingException {

    void one() throws Exception {
        throw new Exception();
    }

    void two() throws Exception {
        throw new Exception("Ow! I fell.");
    }

    void three() {
        throw new RuntimeException();
    }

    void four() {
        throw new RuntimeException("Ow! I fell.");
    }

    public static void main(String[] args) throws Exception {
        Exception e = new RuntimeException();
        throw e;

        throw RuntimeException(); // DOES NOT COMPILE

        try {
            throw new RuntimeException();
            throw new ArrayIndexOutOfBoundsException(); // DOES NOT COMPILE
        } catch (Exception ex) {
        }
    }
}
