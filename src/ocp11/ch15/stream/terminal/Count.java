package ocp11.ch15.stream.terminal;

import java.util.stream.Stream;

public class Count {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
        
        //or
        
        long count = Stream
                .of("monkey", "gorilla", "bonobo")
                .count();
        System.out.println("count");
    }
}
