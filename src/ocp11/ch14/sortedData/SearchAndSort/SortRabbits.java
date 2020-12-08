package ocp11.ch14.sortedData.SearchAndSort;

import java.util.*;

public class SortRabbits {

    static class Rabbit {

        int id;

        public Rabbit(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Rabbit{" + "id=" + id + '}';
        }      
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(2));
        rabbits.add(new Rabbit(1));
//        Collections.sort(rabbits); // DOES NOT COMPILE
        Comparator<Rabbit> c = (r1, r2) ->  r1.id - r2.id;
        Collections.sort(rabbits, c);
        System.out.println(rabbits);
    }
}
