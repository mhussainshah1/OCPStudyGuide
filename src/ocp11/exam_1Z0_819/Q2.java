package ocp11.exam_1Z0_819;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        final Reader reader= new FileReader("File1.txt");
        try(reader){
            reader.read();
        } finally {
            reader.read();
        }
        reader.read();
    }
}
/**
 * Given the directory structure:
continent/
t:: a.txt
country
t b.txt
state
t c.txt
county
and I}
 */

