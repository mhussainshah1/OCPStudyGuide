package ocp8.ch04.review;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Twelve {

    public static void main(String[] args) {
        Supplier<String> x = String::new;
        BiConsumer<String, String> y = (a, b) -> System.out.println();
        UnaryOperator<String> z = a -> a + a;
    }
}