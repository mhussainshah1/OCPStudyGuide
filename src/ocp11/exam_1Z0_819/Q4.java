package ocp11.exam_1Z0_819;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Q4 {

    public static void main(String[] args) {
        BiPredicate<Path, BasicFileAttributes> pred = (path, fileAttrs) -> {
            return fileAttrs.isDirectory();
        };
        int depth = 1;
        try (var stream = Files.find(Paths.get("/continent"), depth, pred)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
        }
    }
}
