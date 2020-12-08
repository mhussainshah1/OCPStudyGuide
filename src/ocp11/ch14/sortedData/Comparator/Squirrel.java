package ocp11.ch14.sortedData.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MultiFieldComparator implements Comparator<Squirrel> {

    @Override
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if (result != 0) {
            return result;
        }
        return s1.getWeight() - s2.getWeight();
    }
}

public class Squirrel {

    private int weight;
    private String species;
    // Assume getters/setters/constructors provided

    public Squirrel(String species, int weight) {
        if (species == null) {
            throw new IllegalArgumentException();
        }
        this.species = species;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Squirrel{" + "weight=" + weight + ", species=" + species + '}';
    }

    
    public static void main(String[] args) {
        //sort accending
        Comparator<Squirrel> c = Comparator
                .comparing(Squirrel::getSpecies)
                .thenComparingInt(Squirrel::getWeight);

        //sort decending
        var c1 = Comparator.comparing(Squirrel::getSpecies).reversed();

        var squirrels = new ArrayList<Squirrel>();       
        squirrels.add(new Squirrel("rock", 12));
        squirrels.add(new Squirrel("fox", 10));
        System.out.println(squirrels);//before sort
         
        Collections.sort(squirrels, c);
        System.out.println(squirrels);//after sort
    }
}
