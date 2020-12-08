package ocp11.ch08.inheritance;

import java.util.List;

public class LongTailAnimal1 {

    protected void chew(List<Object> input) {
    }
    protected void chew(List<Double> input) {} // DOES NOT COMPILE
}
