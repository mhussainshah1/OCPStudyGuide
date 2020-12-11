package ocp11.ch13.applying;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@FunctionalInterface
interface Speedster {
    void go(String name);
}

@interface LongEars {}
@interface Soft {}
@interface Cuddly {}
@interface NotNull {}
@interface Speed {
    String velocity();
}
@interface Edible {}
@interface Food {
    boolean vegetarian();
}

@Target(ElementType.TYPE_USE) 
@interface Tasty {}

@Target(ElementType.TYPE_USE) 
@interface Racer {}

@interface FirstName {}
@interface NotEmpty {}
@interface Valid {}

@LongEars 
@Soft @Cuddly class Rabbit {
    @Deprecated public Rabbit(@NotNull Integer size) {}

    @Speed(velocity = "fast")
    public void eat(@Edible String input) {
        @Food(vegetarian = true)
        String m = (@Tasty String) "carrots";

        Speedster s1 = new @Racer Speedster() {
            @Override public void go(@FirstName @NotEmpty String name) {
                System.out.print("Start! " + name);
            }
        };

        Speedster s2 = (@Valid String n) -> System.out.print(n);
    }
}