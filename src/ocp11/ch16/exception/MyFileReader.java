package ocp11.ch16.exception;

public class MyFileReader implements AutoCloseable {

    private String tag;

    public MyFileReader(String tag) {
        this.tag = tag;
    }

    @Override
    public void close() {
        System.out.println("Closed: " + tag);
    }
}
