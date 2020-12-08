package ocp11.ch10.review;

public class Eight {

    public static void main(String[] args) {
        divide(0,0);
    }
    
    static int divide(int a, int b){
        try {
            return a / b;
        } catch (RuntimeException e) {
            return -1;
        } catch (ArithmeticException e) {
            return 0;
        } finally {
            System.out.print("done");
        }
    }
}
