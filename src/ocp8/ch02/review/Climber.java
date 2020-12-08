package ocp8.ch02.review;

interface Climb1 {

    boolean isTooHigh(int height, int limit);
}

public class Climber {

    public static void main(String[] args) {
        check((h, l) -> h.toString(), 5); // x1
    }

    private static void check(Climb1 climb, int height) {
        if (climb.isTooHigh(height, 10)) // x2
        {
            System.out.println("too high");
        } else {
            System.out.println("ok");
        }
    }
}
