package ocp11.ch15.advance;

import java.util.Optional;

public class ChainingOptionals {

    private static void threeDigit_Java7(Optional<Integer> optional) {
        if (optional.isPresent()) {             // outer if
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) {         // inner if
                System.out.println(string);
            }
        }
    }

    private static void threeDigit_Java8(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println);// part 3
    }

    static Optional<Integer> calculator(String s) {
        return Optional.of(s.length());
    }
    
     public static void main(String[] args) {
        threeDigit_Java7(Optional.empty());
        threeDigit_Java8(Optional.empty());

        threeDigit_Java7(Optional.of(4));
        threeDigit_Java8(Optional.of(4));

        threeDigit_Java7(Optional.of(123));
        threeDigit_Java8(Optional.of(123));

        Optional<String> optional = Optional.of("123");
        Optional<Integer> result = optional.map(String::length);
        System.out.println(result.get());//3

        /*        
        result = optional
                .map(ChainingOptionals::calculator);// DOES NOT COMPILE*/
        
        result = optional
                .flatMap(ChainingOptionals::calculator);
        
        System.out.println(result.get());//3
    }
}
