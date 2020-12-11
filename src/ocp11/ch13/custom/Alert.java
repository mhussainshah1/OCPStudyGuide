package ocp11.ch13.custom;
//Marker Annotation
public @interface Alert {
}

@interface Hazard {
    int danger();//Required element
    //Optional element           Default value
    public String description() default "Fire";
    public static final int UNKNOWN = -1;//Constant variable
}

@Hazard(danger = 100, description = "Wind Damage")
@Alert
class Tornado {
}