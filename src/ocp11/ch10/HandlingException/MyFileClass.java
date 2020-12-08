package ocp11.ch10.HandlingException;

public class MyFileClass implements AutoCloseable {

    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    public void close() {
        System.out.println("Closing: " + num);
    }
}