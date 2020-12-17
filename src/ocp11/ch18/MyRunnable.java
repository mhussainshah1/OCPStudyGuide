package ocp11.ch18;

public class MyRunnable {

    public static void main(String[] args) {
        Runnable sloth = () -> System.out.println("Hello World");
        Runnable snake = () -> {
            int i = 10;
            i++;
        };
        Runnable beaver = () -> {
            return;
        };
        Runnable coyote = () -> {
        };

        Runnable capybara = () -> ""; // DOES NOT COMPILE
        Runnable Hippopotamus = () -> 5; // DOES NOT COMPILE
        Runnable emu = () -> {return new Object();}; // DOES NOT COMPILE
    }
}
