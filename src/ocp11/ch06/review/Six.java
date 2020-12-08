package ocp11.ch06.review;

import java.util.Comparator;
import java.util.function.Consumer;

public class Six {

    public static void main(String[] args) {

    }

    public void method() {
        x((var x) -> {}, (var x, var y) -> 0);
    }

    public void x(Consumer<String> x, Comparator<Boolean> y) {
        
    }
}
