package java11;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LocalVariable {

    public static void main(String[] args) {

        //Lambda expression could be explicitly typed
        BiFunction<Item, Integer, String> process
                = (Item x, Integer y) -> x.value(y);

        //or lambda expression could be imlicitly typed
        process = (x, y) -> x.value(y);

        //or lambda expression can also be implicitly typed with var syntax
        process = (var x, var y) -> x.value(y);

        //These wont compile
        process = (Item x, y) -> x.value(y);//can't mix implicit and explicit typed lambda parmeter
        process = (var x, y) -> x.value(y);//can't mix var and non-var in implicit type
        process = (var x, int y) -> x.value(y);//can't mix var and non-var in explicit

        Function<Item, String> function = (Item x) -> x.toString();
        function = (var x) -> x.toString();

        //You can't omit parenthesis for single explicitly typed or var parameters
        function = Item x -> x.toString();
        function = var x -> x.toString();

    }
}
