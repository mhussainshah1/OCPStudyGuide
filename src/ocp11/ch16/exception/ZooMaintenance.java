package ocp11.ch16.exception;

public class ZooMaintenance {

    public void open() {
        try {
            throw new Exception();
        } catch (Exception e) {
        // Handles exception
        }
    }

    public void close() throws Exception { // Declares exceptions
        throw new Exception();
    }
}