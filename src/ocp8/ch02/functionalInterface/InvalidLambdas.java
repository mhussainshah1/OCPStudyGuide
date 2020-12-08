package ocp8.ch02.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

class Duck {
    public void quack() {
        System.out.println("Quack Quack");
    }
    public String getName(){
        return "Duck";
    }
}

@FunctionalInterface
interface TriFunction<T,U,V,W>{
    W apply(T t,U u,V v);
}

public class InvalidLambdas {
    public static void main(String[] args) {
        Consumer<Duck> consumer = (Duck d) -> d.quack();
        BiConsumer<Animal, Duck> function = (Animal a, Duck d) -> d.quack();

        Supplier supplier = () -> true;// 0 parameters
        Function<String, Boolean> f1 = a -> {return a.startsWith("test");}; // 1 parameter
        f1 = (String a) -> a.startsWith("test"); // 1 parameter
        
        IntConsumer c1 = (int x) -> {}; // 1 parameter
        c1 = (int y) -> {return;}; // 1 parameter        

        BiFunction<String, String, Boolean> bf1 = (a, b) -> a.startsWith("test"); // 2 parameters
        bf1 = (String a, String b) -> a.startsWith("test"); // 2 parameters

        BiFunction<Integer, Integer, Integer> bf2 = (y, z) -> {int x=1; return y+10; };
        BiFunction<String, Integer, Integer> bf3 = (String s, Integer z) -> { return s.length()+z; };
        TriFunction<Duck,Animal,String,String> ft = (a, b, c) -> a.getName();
        
        BiFunction<Integer, Integer, Integer> bf4 = (a, b) -> {
            int a = 0;//cant re-declare a local variable
            return 5;
        };

        bf4 = (a, b) -> {
            int c = 0;//declare a local variable
            return 5;
        };

    }
}
