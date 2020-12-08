package ocp11.ch13;

import java.util.function.Function;
import ocp11.ch15.exam.Interned;
import ocp11.ch15.exam.NonNull;

public class FunctionalInterface {

    public static void main(String[] args) {
//        Which three annotation uses are valid?
//
//        Function<String, String> func = (var  @NonNull x) -> x.toUpperCase();
        var obj = new @Interned MyObject();
//
        Function<String, String> func = ( @NonNull x) -> x.toUpperCase();
//
        var myString = (@NonNull String) str;

        Function<String, String> func = (@NonNull  var x) -> x.toUpperCase();
        var v = "Hello " + (@Interned) "World";
    }

}

@Interned
class MyObject{
    
}
