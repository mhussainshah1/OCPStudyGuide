package ocp11.ch13.exam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.function.Function;

@Target(ElementType.TYPE_USE)
@interface Interned {}

@Target(ElementType.TYPE_USE)
@interface NonNull {}

public class FunctionalInterface {

    public static void main(String[] args) {
//        Which three annotation uses are valid?
//        Function<String, String> func1 = (var  @NonNull x) -> x.toUpperCase();
        
        var obj = new @Interned MyObject();

//        Function<String, String> func2 = ( @NonNull x) -> x.toUpperCase();

        String str="annotations";
        var myString = (@NonNull String) str;

        Function<String, String> func3 = (@NonNull var x) -> x.toUpperCase();
        
//        var v = "Hello " + (@Interned) "World";
    }
}

class MyObject{
}
