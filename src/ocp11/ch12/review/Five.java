package ocp11.ch12.review;

import java.util.function.BiFunction;
import java.util.function.Consumer;
class Wolf {}
class Camel {}
public class Five {

    public static void main(String[] args) {
//        (Wolf w, var c) -> 39
        Consumer<Camel> con = (final Camel c) -> {
        };
//        (a, b, c) -> {
//            int b = 3;
//            return 2;
//        };
        BiFunction<Integer, Integer, Exception> f = (x, y) -> new RuntimeException();
//        (var y) -> {return 0;};
//        () -> {float r}
//        (Cat a, b) -> {}
    }
}