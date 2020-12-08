package ocp11.ch15.review;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Eleven {

    public static void main(String[] args) {
        System.out.println(Stream.iterate(1, x -> ++x)//Change x -> x++ to x -> ++x.
                .limit(5)
                .map(x -> "" +x)//Change map(x -> x) to map(x -> "" + x) .
                .collect(Collectors.joining()));
    }
}
