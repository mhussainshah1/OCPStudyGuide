package ocp11.ch15.review;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Seventeen {

    public static void main(String[] args) {
        UnaryOperator<Integer> u = x -> x * x;
        //Similarly
        Function<Integer, Integer> f = x -> x * x;
    }
}
