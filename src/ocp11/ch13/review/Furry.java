package ocp11.ch13.review;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
public @interface Furry {

    public String[] value();

    boolean cute() default true;
}

class Bunny {

    @Furry("Soft")
    public static int hop() {
        return 1;
    }
}
