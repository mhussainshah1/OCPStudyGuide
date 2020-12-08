package ocp8.ch03.Comparing.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck> {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() { // use readable output
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name); // call String's compareTo
    }

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks); // sort by name
        System.out.println(ducks); // [Puddles, Quack]
    }
}
