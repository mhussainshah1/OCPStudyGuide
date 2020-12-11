package ocp11.ch13.specific;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)//By Default
@interface Flier {
}

@Retention(RetentionPolicy.RUNTIME)
@interface Swimmer {
}
