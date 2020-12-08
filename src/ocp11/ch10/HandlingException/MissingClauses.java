package ocp11.ch10.HandlingException;

public class MissingClauses {

    public static void main(String[] args) {
        try { // DOES NOT COMPILE
            fall();
        } finally {
            System.out.println("all better");
        }catch (Exception e) {
            System.out.println("get up");
        }

        try { // DOES NOT COMPILE
            fall();
        }

        try {
            fall();
        } finally {
            System.out.println("all better");
        }
    }

    private static void fall() {
        throw new RuntimeException();
    }
}