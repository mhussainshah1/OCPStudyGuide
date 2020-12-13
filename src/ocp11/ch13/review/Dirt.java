package ocp11.ch13.review;

import java.lang.annotation.Documented;

enum Color {
    GREY, BROWN
}

@Documented
public @interface Dirt {
    boolean wet();
    String type()= "unknown";
    public Color color();
    private static final int slippery = 5;
}
