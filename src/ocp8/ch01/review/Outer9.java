package ocp8.ch01.review;

public class Outer9 {

    private int x = 24;

    public int getX() {
        // Effectively final variable
        String message = "x is ";
        //Alternatively, final variable
//      final String message = "x is ";
        class Inner {

            private int x = Outer9.this.x;

            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
        new Outer9().getX();
    }
}
