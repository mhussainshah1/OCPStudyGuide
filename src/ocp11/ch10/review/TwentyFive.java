package ocp11.ch10.review;

public class TwentyFive {

    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method() {
        int a = 1, b = 1;
        try {
            return a / b;
        } catch (ClassCastException e) {
            return 10;
        } catch (RuntimeException e) {
            return 20;
        } finally {
            return 30;
        }
    }
}
