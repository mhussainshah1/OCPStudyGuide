package ocp11.ch10.HandlingException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

public class MultiCatchBlock {

    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing or invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

        //or Multi-catch Block
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

        try {
            throw new IOException();
        } catch (FileNotFoundException | IOException p) {
        } // DOES NOT COMPILE

        try {
            throw new IOException();
        } catch (IOException e) {
        }
    }

    public void doesNotCompile() { // METHOD DOES NOT COMPILE
        try {
            mightThrow();
        } catch (FileNotFoundException | IllegalStateException e) {
        } catch (InputMismatchException /*e*/ | MissingResourceException e) {
        } catch (/*FileNotFoundException |*/IllegalArgumentException e) {
        } catch (Exception e) {
        } catch (IOException e) {
        }
    }

    private void mightThrow() throws DateTimeParseException, IOException {        
    }
}
