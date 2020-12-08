package ocp11.ch15.review;

import java.util.Optional;

public class TwentyTwo {
  
    public static void main(String[] args) throws Exception {
        Optional<String> opt= Optional.empty();
        
        System.out.println(opt.orElse(""));
        System.out.println(opt.orElseGet(() -> ""));
        System.out.println(opt.orElseThrow());//NoSuchElementException
//        opt.orElseThrow(() -> throw new Exception());
        opt.orElseThrow(RuntimeException::new);
        System.out.println(opt.get());//NoSuchElementException
//        opt.get("");
    }
}
