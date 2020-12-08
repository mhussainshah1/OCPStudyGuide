package ocp8.ch01.nestedClasses;

public class OuterLocal {

    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Inner {

            public static final int CONSTANT = 1;

            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        OuterLocal outer = new OuterLocal();
        outer.calculate();
    }

    public void isItFinal() {
        int one = 20; //effectively final
        int two = one;
        two++; //not effectively final
        int three;//effectively final: three is assigned once in the if statement
        if (one == 4) {
            three = 3;
        } else {
            three = 4;
        }
        int four = 4;
        class Inner {
        }
        four = 5;//not effectively final
    }
}
