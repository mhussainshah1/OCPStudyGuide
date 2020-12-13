package ocp11.ch13.review;

import java.lang.annotation.*;
import java.util.function.Predicate;

@Target(ElementType.TYPE_USE)
@interface Floats {

    int buoyancy() default 2;
}

interface Wood {}

@Floats
class Duck {}

@Floats
class Birch implements @Floats Wood {

    @Floats(buoyancy = 10)
    boolean mill() {
        Predicate<Integer> t = (@Floats Integer a) -> a > 10;
        return (@Floats boolean) t.test(12);
    }
}
