package ocp11.ch10.review;

public class Laptop {

    public void start() {
        try {
            System.out.print("Starting up ");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("Problem ");
            System.exit(0);
        } finally {
            System.out.print("Shutting down ");
        }
    }

    public static void main(String[] args) {
        new Laptop().start();
    }
}
