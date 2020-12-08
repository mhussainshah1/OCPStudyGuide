package ocp11.ch10.review;

public class Help {

    public void callSuperhero() {
        try (String raspberry = new String("Olivia")) {
            System.out.print("Q");
        } catch (Error e) {
            System.out.print("X");
        } finally {
            System.out.print("M");
        }
    }

    public static void main(String[] args) {
        new Help().callSuperhero();
        System.out.print("S");
    }
}
