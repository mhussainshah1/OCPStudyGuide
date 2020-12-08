package ocp8.ch04.review;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Eight {

    public static void main(String[] args) {
        IntStream is = IntStream.empty();
        OptionalDouble od = is.average();
        System.out.println(od);//OptionalDouble.empty

        OptionalInt opi = is.findAny();
        System.out.println(opi); //OptionalInt.empty

        int oi = is.sum();
        System.out.println(oi);//0
    }
}
