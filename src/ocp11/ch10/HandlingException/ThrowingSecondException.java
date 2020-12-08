package ocp11.ch10.HandlingException;

import java.io.FileReader;
import java.io.IOException;

public class ThrowingSecondException {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            System.out.println("before");
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException inner) {
                System.out.println("inner");
            }
        }
        System.out.println(exceptions(""));
    }

    private static FileReader read() throws IOException {
        // CODE GOES HERE
        throw new IOException();
    }

    public static void exceptions() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new RuntimeException();
        }
    }

    public static String exceptions(String results) {
        StringBuilder result = new StringBuilder();
        String v = null;
        try {
            try {
                result.append("before_");
                v.length();
                result.append("after_");
            } catch (NullPointerException e) {
                result.append("catch_");
                throw new RuntimeException();
            } finally {
                result.append("finally_");
                throw new Exception();
            }
        } catch (Exception e) {
            result.append("done");
        }
        return result.toString();
    }
}
