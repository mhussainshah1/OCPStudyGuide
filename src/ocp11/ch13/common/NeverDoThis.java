package ocp11.ch13.common;

import java.util.*;

public class NeverDoThis {

    final int thisIsUnsafe(List<Integer>... carrot) {
        Object[] stick = carrot;
        stick[0] = Arrays.asList("nope!");
        return carrot[0].get(0); // ClassCastException at runtime
    }

    public static void main(String[] a) {
        var carrot = new ArrayList<Integer>();
        new NeverDoThis().thisIsUnsafe(carrot);
    }

    @SafeVarargs
    private void eat(int... meal) {
    } // DOES NOT COMPILE

    @SafeVarargs
    protected void drink(String... cup) {
    } // DOES NOT COMPILE

    @SafeVarargs
    void chew(boolean... food) {
    } // DOES NOT COMPILE
}
