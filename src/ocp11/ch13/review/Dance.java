package ocp11.ch13.review;

public @interface Dance {

    long rhythm() default 66;

    int[] value();

    String track() default "";
    final boolean fast = true;
}

class Sing1 {

    @Dance(77)
    String album;
}

class Sing2 {

    @Dance(value = 5, rhythm = 2, track = "Samba")
    String album;
}
