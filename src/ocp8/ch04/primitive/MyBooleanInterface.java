package ocp8.ch04.primitive;

import java.util.function.BooleanSupplier;

public class MyBooleanInterface {

    public static void main(String[] args) {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());
    }
}