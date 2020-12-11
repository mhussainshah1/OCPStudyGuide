package ocp11.ch13.specific;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface ZooAttraction {
}

@ZooAttraction
class RollerCoaster {
}

class Events {

    @ZooAttraction
    String rideTrain() {
        return (@ZooAttraction String) "Fun!";
    }

    @ZooAttraction
    Events(@ZooAttraction String description) {
        super();
    }
    
    @ZooAttraction
    int numPassengers;
}
