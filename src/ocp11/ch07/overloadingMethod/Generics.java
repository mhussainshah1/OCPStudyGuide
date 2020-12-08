package ocp11.ch07.overloadingMethod;

import java.util.List;

public class Generics {

    public void walk(List<String> strings) {
    }

    public void walk(List<Integer> integers) {
    } // DOES NOT COMPILE
}