package ocp11.ch15.review;

import java.util.stream.LongStream;

public class Nine {

    public static void main(String[] args) {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream .map(n -> n * 10)
                .filter(n -> n < 5)
                .findFirst();
        if (opt.isPresent()) {
            System.out.println(opt.getAsLong());
        }

        opt.ifPresent(System.out::println);
    }
}
