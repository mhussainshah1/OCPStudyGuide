package ocp11.ch13.review;

import java.lang.annotation.Repeatable;

@interface FerociousPack {

    Ferocious[] value(); // m1
}

@Repeatable(FerociousPack.class) // m2
public @interface Ferocious {
}

@Ferocious
@Ferocious
class Lion {
}
