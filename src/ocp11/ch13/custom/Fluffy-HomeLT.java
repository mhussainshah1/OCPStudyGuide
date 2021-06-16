package ocp11.ch13.custom;

interface MyInterface{
    void test();
}

@interface Material {}

public @interface Fluffy {
    int cuteness();
    public abstract int softness() default 11;
    protected Material material(); // DOES NOT COMPILE
    private String friendly(); // DOES NOT COMPILE
    final boolean isBunny(); // DOES NOT COMPILE
    void test();// DOES NOT COMPILE
}
