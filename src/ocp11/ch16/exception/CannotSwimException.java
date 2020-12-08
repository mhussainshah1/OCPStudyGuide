package ocp11.ch16.exception;

public class CannotSwimException extends Exception {

    public CannotSwimException() {
        super(); // Optional, compiler will insert automatically
    }

    public CannotSwimException(Exception e) {
        super(e);
    }

    public CannotSwimException(String message) {
        super(message);
    }
}

class DangerInTheWater extends RuntimeException {
}

class SharkInTheWaterException extends DangerInTheWater {
}

class Dolphin {

    public void swim() throws CannotSwimException {
        // logic here
    }

}
