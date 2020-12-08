package ocp11.ch16.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InheritingException {

    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException | FileNotFoundException e) {} // DOES NOT COMPILE

        try {
            throw new IOException();
        } catch (IOException e) {
        } catch (FileNotFoundException e) {} // DOES NOT COMPILE
    }
}
