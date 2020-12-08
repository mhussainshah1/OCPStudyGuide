package ocp11.ch16.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResource2 {

    public void copyData(Path path1, Path path2) throws Exception {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            out.write(in.readLine());
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();

            }
        }
    }

    //or
    public void copyData2(Path path1, Path path2) throws Exception {
        try (var in = Files.newBufferedReader(path1);
                var out = Files.newBufferedWriter(path2)) {
            out.write(in.readLine());
        }
    }
}
