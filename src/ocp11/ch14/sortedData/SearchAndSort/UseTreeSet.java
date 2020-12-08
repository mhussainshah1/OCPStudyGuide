package ocp11.ch14.sortedData.SearchAndSort;

import java.util.Set;
import java.util.TreeSet;
import ocp11.ch14.sortedData.Comparable.Duck;

public class UseTreeSet {

    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));
//        Set<Rabbit> rabbit = new TreeSet<>();
//        rabbit.add(new Rabbit()); // ClassCastException
        Set<Rabbit> rabbit = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbit.add(new Rabbit());
    }
}