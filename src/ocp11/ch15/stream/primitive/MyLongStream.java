package ocp11.ch15.stream.primitive;

import java.util.stream.LongStream;

public class MyLongStream {

    public static void main(String[] args) {
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum); // 15
    }
}
