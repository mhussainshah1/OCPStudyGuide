package ocp11.ch06;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LocalVariableInsideLambda {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> 
        
        v = (a, b) -> {
            int c = 0;
            return 5;
        };
       
        v = (a, b) -> {
            int a = 0;
            return 5;
        }; // DOES NOT COMPILE

    }

    public void variables(int a) {
        int b = 1;
        Predicate<Integer> p1 = a -> {
            int b = 0;
            int c = 0;
            return b == c;
        }
    }
}