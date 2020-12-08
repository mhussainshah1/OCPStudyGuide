package ocp8.ch04.primitive;

import java.util.stream.DoubleStream;

public class MyDoubleStream {

    public static void main(String[] args) {
        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);
     
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(Math::random);        
        random.limit(3).forEach(System.out::println);
  
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        fractions.limit(3).forEach(System.out::println);   
    }
}
