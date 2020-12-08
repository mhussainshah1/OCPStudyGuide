package ocp11.ch12.nestedClasses;

public class Outer {

    private String greeting = "Hi";

    protected class Inner {

        public int repeat = 3;
        public static final int CONSTANT = 1;

        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        //Alternatively,
        Inner inner = outer.new Inner(); // create the inner class
        inner.go();
    }
}