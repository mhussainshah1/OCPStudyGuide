package ocp11.ch12.functionalProgramming;

import java.util.function.Predicate;

public class Crow1 {

    private String color;

    public void caw(String name) {
        String volume = "loudly";
        color = "allowed";
//        name = "not allowed";
//        volume = "not allowed";
        Predicate<String> p
                = s -> (name + volume + color).length() == 9; // DOES NOT COMPILE
    }
}
