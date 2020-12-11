package ocp11.ch13.specific;

import java.lang.annotation.Documented;

@Documented
public @interface Hunter {
}

@Hunter
class Lion {
}
