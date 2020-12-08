package ocp11.ch16.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EffectiveFinal {

    public void relax() {
        final var bookReader = new MyFileReader("4");
        MyFileReader movieReader = new MyFileReader("5");
        try (bookReader;
                var tvReader = new MyFileReader("6");
                movieReader) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }
    }

    public void useNotFinal(Path path) throws IOException {
        var writer = Files.newBufferedWriter(path);
        try (writer) { // DOES NOT COMPILE
            writer.append("Welcome to the zoo!");
        }
        writer = null;
    }

    public void useCloseResource(Path path) throws IOException {
        var writer = Files.newBufferedWriter(path);
        writer.append("This write is permitted but a really bad idea!");
        try (writer) {
            writer.append("Welcome to the zoo!");
        }
        writer.append("This write will fail!"); // IOException
    }

    public void ifWriterThrowException(Path path1, Path path2) throws IOException {
        var reader = Files.newBufferedReader(path1);
        var writer = Files.newBufferedWriter(path2); // Don’t do this!
        try (reader; writer) {
        }
    }

    public static void main(String[] args) {
        new EffectiveFinal().relax();
    }
}
