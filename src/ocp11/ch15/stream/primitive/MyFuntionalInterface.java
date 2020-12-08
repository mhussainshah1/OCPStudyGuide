package ocp11.ch15.stream.primitive;

import java.util.function.DoubleToIntFunction;
import java.util.function.ToIntFunction;

public class MyFuntionalInterface {

    public static void main(String[] args) {
        double d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        f1.applyAsInt(d);
        
        ToIntFunction f2 = x -> 1;
        f2.applyAsInt(d);
    }
}