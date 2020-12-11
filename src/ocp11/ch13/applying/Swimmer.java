package ocp11.ch13.applying;

public @interface Swimmer {
    int armLength = 10;
    String stroke();
    String name();
    String favoriteStroke() default "Backstroke";
}

@Swimmer class Amphibian {}

@Swimmer(favoriteStroke="Breaststroke", name="Sally") class Tadpole {}

@Swimmer(stroke="FrogKick", name="Kermit") class Frog {}

@Swimmer(stroke="Butterfly", name="Kip", armLength=1) class Reptile {}

@Swimmer(stroke="", name="", favoriteStroke="") class Snake {}