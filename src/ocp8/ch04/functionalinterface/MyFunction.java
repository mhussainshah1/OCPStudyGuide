package ocp8.ch04.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

//Creating own functional interface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

interface QuadFunction<T, U, V, W, R> {
    R apply(T t, U u, V v, W w);
}

public class MyFunction {

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }
}
