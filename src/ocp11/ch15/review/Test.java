package ocp11.ch15.review;

import java.io.IOException;
import static java.nio.file.Files.lines;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(List<String> paths) throws IOException{
        paths.stream()
                .map(p -> Paths.get(p))
                .filter(p -> p.toString().endsWith(".java"))
                .flatMap(p -> lines(p))
                .filter(l -> !l.isEmpty())
                .collect(Collectors.toList());
    }
}
