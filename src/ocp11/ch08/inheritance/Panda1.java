package ocp11.ch08.inheritance;

class Bear1 {

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}

public class Panda1 extends Bear1 {

    public void sneeze() { // DOES NOT COMPILE
        System.out.println("Panda sneezes quietly");
    }

    public static void hibernate() { // DOES NOT COMPILE
        System.out.println("Panda is going to sleep");
    }

    protected static void laugh() { // DOES NOT COMPILE
        System.out.println("Panda is laughing");
    }
}
