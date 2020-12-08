package ocp11.ch16.exception;

public class JammedTurkeyCage4 implements AutoCloseable {

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
        try (JammedTurkeyCage4 t = new JammedTurkeyCage4()) {
            throw new IllegalStateException("Turkeys ran off");
        } finally {
            throw new RuntimeException("and we couldn't find them");
        }
    }
}
