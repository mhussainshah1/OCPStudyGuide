package ocp8.ch03.SearchAndSort;

import java.util.Set;
import java.util.TreeSet;
import ocp8.ch03.Comparing.Comparable.Duck;

public class UseTreeSet {

    static class Rabbit {

        int id;
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));
//        Set<Rabbit> rabbit = new TreeSet<>();
//        rabbit.add(new Rabbit()); // throws an exception
        Set<Rabbit> rabbit = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbit.add(new Rabbit());

    }
}
