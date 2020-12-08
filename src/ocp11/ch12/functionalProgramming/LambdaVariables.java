package ocp11.ch12.functionalProgramming;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaVariables {

    public static void main(String[] args) {
        Predicate<String> p = x -> true;
        p = (var x) -> true;
        p = (String x) -> true;
        
        
        Function<Integer,Integer> f = (var num) -> 1;
        f= var w -> 99;
        BiFunction<Integer,Integer, String> bf= (final var a, var b) -> "Hello";
        BiFunction<Integer,Integer, Boolean> bf1= (var a, Integer b) -> true;
        TriFunction<String,Integer, Integer, Boolean> tf=(String x, var y, Integer z) -> true;
        TriFunction<String,Integer, Integer, Double> tf1 =(var b, var k, var m) -> 3.14159;
        bf = (var x, y) -> "goodbye" ;

    }

    public void whatAmI() {
        test((var x) -> x > 2, 123);
    }

    public void test(Predicate<Integer> c, int num) {
        c.test(num);
    }

    public void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
    }   
}

interface TriFunction<T, U, V, R> {
     R apply(T t, U u, V v);
}