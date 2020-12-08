package ocp11.ch08.inheritance;

import java.util.ArrayList;
import java.util.List;

public class LongTailAnimal4 {

    protected void chew(List<Object> input) {
    }
}

class Anteater4 extends LongTailAnimal4 {

    protected void chew(ArrayList<Double> input) {
    }
}
