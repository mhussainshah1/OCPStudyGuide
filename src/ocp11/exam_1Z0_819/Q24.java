package ocp11.exam_1Z0_819;
//C
public class Q24 {

    public static void main(String[] args) {
        float x = 2, y = 3, z = 4;
        float a = y % x, b = z % y;
        if (a > b) {
            System.out.println(a + b);
        }
    }
}
