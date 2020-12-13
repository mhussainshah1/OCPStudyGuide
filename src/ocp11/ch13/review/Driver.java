package ocp11.ch13.review;

import java.lang.annotation.*;

@Documented
@Deprecated
public @interface Driver {

    int[] directions();

    String name() default "";
}

@Driver(directions = 7)
class Taxi1 {
}

@Driver(directions={0,1})
class Taxi2 {
}
