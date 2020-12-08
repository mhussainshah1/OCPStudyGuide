package ocp11.ch08.constructor;

public class Hamster {

    private String color;
    private int weight;

    public Hamster(int weight) { // first constructor
//        this.weight = weight;
//        color = "brown";

//or
        this(weight, "brown");
        
//        Hamster(weight, "brown"); // DOES NOT COMPILE
//        new Hamster(weight, "brown"); // Compiles but does not do what we want        
    }

    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
}
