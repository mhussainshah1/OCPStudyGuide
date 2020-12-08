package ocp11.ch07.review.rope;

public class Rope {

    public static int LENGTH = 5;

    static {
        LENGTH = 10;
    }

    public static void swing() {
        System.out.print("swing ");
    }
}
