package ocp11.ch15.review;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Five {

    public static void main(String[] args) {

//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
//
//        result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x)//Error
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(result);
        
//        result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

//        result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x)//Error
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
//        
        result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(result);
    }

}
