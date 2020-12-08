package ocp8.appendix_B;

public class Relationship {

    public static void main(String[] args) {
        int x = 0;
        while (++x < 5) {
            x += 1;
        }
        String message = x > 5 ? "Greater than" : "Less Than";
        System.out.println(message + "," + x);
    }
}
