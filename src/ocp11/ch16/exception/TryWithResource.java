package ocp11.ch16.exception;

public class TryWithResource {

    public static void main(String[] args) {
        try (var bookReader = new MyFileReader("monkey")) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }

        try (var bookReader = new MyFileReader("1");
                var movieReader = new MyFileReader("2");
                var tvReader = new MyFileReader("3");) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }
    }
}