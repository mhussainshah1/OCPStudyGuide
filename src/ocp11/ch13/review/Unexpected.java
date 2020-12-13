package ocp11.ch13.review;

import java.lang.annotation.*;

class Food {}

@Inherited
public @interface Unexpected {

    public String rsvp() default null;
    Food food();
    public String[] dessert();
    final int numberOfGuests = 5;
    long startTime() default 0L;
}
