package ocp11.ch10.review;

public class Twenty {

    public static void main(String[] args) throws Throwable {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        } finally {
            System.out.print("e");
            throw new RuntimeException("3");
        }
    }

    public float parseFloat(String s) {
        float f = 0.0f;     // 1
        try {
            f = Float.valueOf(s).floatValue();    // 2
            return f;       // 3
        } catch (NumberFormatException nfe) {
            f = Float.NaN;  // 4
            //return f;     // 5
        } finally {
            //return f;     // 6
        }
        return f;           // 7
    }
}