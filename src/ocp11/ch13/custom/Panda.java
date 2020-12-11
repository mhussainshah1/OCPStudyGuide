package ocp11.ch13.custom;

class Bear {
}

enum Size {
    SMALL, MEDIUM, LARGE
}

public @interface Panda {

    Integer height();//Error: element can't be wrapper class type

    String[][] generalInfo();//Error: element can't be multi-dimentional array 

    Size size() default Size.SMALL;

    Bear friendlyBear();//Error: class or interface is not supported type

    Exercise exercise() default @Exercise(hoursPerDay = 2);
}
