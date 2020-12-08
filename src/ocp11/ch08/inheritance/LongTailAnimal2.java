package ocp11.ch08.inheritance;

import java.util.List;

public class LongTailAnimal2 {

    protected void chew(List<Object> input) {
    }
}

class Anteater extends LongTailAnimal2 {

    protected void chew(List<Double> input) {} // DOES NOT COMPILE
}
