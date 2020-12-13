package ocp11.ch13.specific;

import java.lang.annotation.Inherited;

@Inherited
public @interface Vertebrate {
}

@Vertebrate
class Mammal {
}

class Dolphin extends Mammal {
}
