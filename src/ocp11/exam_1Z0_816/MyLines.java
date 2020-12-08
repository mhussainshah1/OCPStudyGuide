package ocp11.exam_1Z0_816;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MyLines {

    public static void main(String[] args) {
        try {
            var lines = Files.lines(Paths.get("Test.txt"));

            lines.map(l -> l.toUpperCase())
                    .forEach(line -> {
                        try {
                            Files.write(Paths.get(""), line.getBytes(), StandardOpenOption.CREATE);
                        } catch (IOException e) {
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
