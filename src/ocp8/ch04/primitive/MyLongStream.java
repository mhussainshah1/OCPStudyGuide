package ocp8.ch04.primitive;

import java.util.stream.LongStream;

public class MyLongStream {

    public static void main(String[] args) {
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum); // 15
    }
}
