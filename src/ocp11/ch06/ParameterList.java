package ocp11.ch06;

import java.util.List;
import java.util.function.Consumer;

public class ParameterList {

    public static void main(String[] args) {
        new ParameterList().whatAmI();
    }

    public void whatAmI() {
        //x is Integer
        consume((var x) -> System.out.print(x), 123);        
    }

    public void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }

    public void counts(List<Integer> list) {
        //x and y are Integer
        list.sort((var x, var y) -> x.compareTo(y));
    }
}