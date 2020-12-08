package ocp11.ch15.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethod {

    public static void main(String[] args) {

        //Convinence Methods
        //Predicate
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

//        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
//        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        System.out.println(brownEggs.test("eggbrown"));

        //Consumer
        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.println(",2: " + x);
        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie"); // 1: Annie,2: Annie

        //Function
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined2 = after.andThen(before);
        System.out.println(combined2.apply(3)); //(3*2) +1 = 7
        
        combined2 = after.compose(before);
        System.out.println(combined2.apply(3)); //(3+1) *2 = 8
    }
}
