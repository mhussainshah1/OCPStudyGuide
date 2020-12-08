package ocp11.ch09.interfaces;

interface Herbivore1 {
    public int eatPlants(int quantity);
}

interface Omnivore1 {
    public void eatPlants();
}

public class Bear1 implements Herbivore1, Omnivore1 {
    public int eatPlants(int quantity) {
        System.out.println("Eating plants: " + quantity);
        return quantity;
    }

    public void eatPlants() {
        System.out.println("Eating plants");
    }
}