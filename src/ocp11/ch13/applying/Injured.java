package ocp11.ch13.applying;

public @interface Injured {
    String veterinarian() default "unassigned";
    String value() default "foot";
    int age() default 1;
}

abstract class Elephant {

    @Injured("Legs")
    public void fallDown() {}

    @Injured(value = "Legs")
    public abstract int trip();
    
    @Injured
    String injuries[];
}

@Injured("Broken Tail")
class Monkey {}

@Injured("Fur",age=2) 
public class Bear {} // DOES NOT COMPILE