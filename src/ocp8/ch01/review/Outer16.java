package ocp8.ch01.review;

public class Outer16 {

    class Inner {
    }

    public static void main(String[] args) {
        Outer16.Inner in = new Outer16().new Inner();
    }
}
