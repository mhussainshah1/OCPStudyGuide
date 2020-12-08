package ocp8.ch04.review;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class Nine {

    public static void main(String[] args) {
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls
                .map(n -> n * 10)
                .filter(n -> n < 5)
                .findFirst();
        if (opt.isPresent()) {
            System.out.println(opt.getAsLong());
        }
        
        opt.ifPresent(System.out::println);
    }
}
