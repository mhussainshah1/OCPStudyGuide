package ocp8.ch04.advance;

import java.util.Optional;

public class ChainingOptionals {

    public static void main(String[] args) {
        threeDigit(Optional.empty());
        threeDigit(Optional.of(4));
        threeDigit(Optional.of(123));
        
        Optional<String> optional = Optional.of("123");
        Optional<Integer> result = optional.map(String::length);
        System.out.println(result.get());//3
        
//        result = optional.map(ChainingOptionals::calculator);// DOES NOT COMPILE
        result = optional.flatMap(ChainingOptionals::calculator);
        System.out.println(result.get());//3
    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {             // outer if
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) {         // inner if
                System.out.println(string);
            }
        }

        optional.map(n -> "" + n)               // part 1
                .filter(s -> s.length() == 3)   // part 2
                .ifPresent(System.out::println);// part 3
    }
    
    static Optional<Integer> calculator(String s){
        return Optional.of(s.length());
    }
}