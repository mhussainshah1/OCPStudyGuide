package java11;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Guideline3 {

    public static void main(String[] args) throws IOException {
        var outputStream = new ByteArrayOutputStream();
        var reader = Files.newBufferedReader(Path.of(""));
        var list = List.of("a", "b", "c");
    }
}