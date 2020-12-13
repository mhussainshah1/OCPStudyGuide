package ocp11.ch13.review;

import java.lang.annotation.*;

enum UnitOfTemp {
    C, F
}

@interface Snow {

    boolean value();
}

@Target(ElementType.METHOD)
public @interface Cold {

    private Cold () {}
    int temperature;
    UnitOfTemp unit default UnitOfTemp.C ;

    Snow snow() default @Snow(true);
}
