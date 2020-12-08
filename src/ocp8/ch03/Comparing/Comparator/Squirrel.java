package ocp8.ch03.Comparing.Comparator;

public class Squirrel {

    private int weight;
    private String species;

    public Squirrel(String theSpecies) {
        if (theSpecies == null) {
            throw new IllegalArgumentException();
        }
        species = theSpecies;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }
}