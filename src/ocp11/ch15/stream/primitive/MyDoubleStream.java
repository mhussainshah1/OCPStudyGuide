package ocp11.ch15.stream.primitive;

import java.util.stream.DoubleStream;

public class MyDoubleStream {

    public static void main(String[] args) {
        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);
     
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

        var random = DoubleStream.generate(Math::random);        
        random.limit(3).forEach(System.out::println);
  
        var fractions = DoubleStream.iterate(.5, d -> d / 2);
        fractions.limit(3).forEach(System.out::println);   
    }
}
