package ocp11.ch16.exception;

public class JammedTurkeyCage3 implements AutoCloseable {

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
        try (var t = new JammedTurkeyCage3()) {
            throw new RuntimeException("Turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
        }
    }
}
