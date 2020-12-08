package ocp11.ch15.review;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sixteen {

    public static void main(String[] args) {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);//{false=[], true=[]}
        
        var result2 = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(n -> n));
        System.out.println(result2);//{}
    }
}
