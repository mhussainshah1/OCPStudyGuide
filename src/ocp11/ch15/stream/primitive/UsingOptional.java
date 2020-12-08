package ocp11.ch15.stream.primitive;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class UsingOptional {

    public static void main(String[] args) {
        var stream = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = stream.average();

        optional.ifPresent(System.out::println);//5.5
        System.out.println(optional.getAsDouble());//5.5
        System.out.println(optional.orElseGet(() -> Double.NaN));//5.5  or optional.orElseGet(null)
    
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.limit(3).min(); // runs infinitely
        
        DoubleStream
                .generate(() -> Math.PI)
                .limit(3)
                .min(); 
        System.out.println(min);
    }
}
