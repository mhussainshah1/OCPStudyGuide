package ocp11.ch16.exception;

import java.io.FileNotFoundException;

public class CannotSwimException3 extends Exception{

    public CannotSwimException3() {
        super(); // Optional, compiler will insert automatically
    }

    public CannotSwimException3(Exception e) {
        super(e);
    }

    public CannotSwimException3(String message) {
        super(message);
    }

    public static void main(String[] args) throws Exception {      
//        throw new CannotSwimException2("broken fin");
        throw new CannotSwimException3(
                new FileNotFoundException("Cannot find shark file"));
    }
}
