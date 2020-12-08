package ocp11.ch16.exception;

import java.util.Scanner;

public class TryWithResource3 {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
        } catch (Exception e) {
            s.nextInt(); // DOES NOT COMPILE
        } finally {
            s.nextInt(); // DOES NOT COMPILE
        }
    }
}
