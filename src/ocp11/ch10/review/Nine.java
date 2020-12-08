package ocp11.ch10.review;

public class Nine {

    public static void main(String[] args) {
        int a = 0, b = 0;
        try {
            System.out.print(a / b);
        } catch (RuntimeException e) {
            System.out.print(-1);
        } catch (ArithmeticException e) {
            System.out.print(0);
        } finally {
            System.out.print("done");
        }
    }
}
