package ocp8.appendix_B;

public class EmbededLoop {

    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        while (x < y) {
            System.out.println("<><>");
            for (int i = 2; i < 5; i++, x++) {
                x++;
                System.out.println("—");
            }
        }
        System.out.println(x + "," + y);
    }
}
