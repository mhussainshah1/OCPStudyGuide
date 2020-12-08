package ocp8.ch04.functionalinterface;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Test {

    public static void main(String[] args) {
        Predicate<List> ex1 = x -> "".equals(x.get(0));
        Consumer<Long> ex2 = (Long l) -> System.out.println(l);
        BiPredicate<String, String> ex3 = (s1, s2) -> false;

        Function<List<String>> ex1 = x -> x.get(0); // DOES NOT COMPILE
        UnaryOperator<Long> ex2 = (Long l) -> 3.14; // DOES NOT COMIPLE
        Predicate ex4 = String::isEmpty; // DOES NOT COMPILE
    }
}
