package ocp8.ch01.virtualMethod;

abstract class Animal {

    String name = "???";

    public abstract void feed();

    public void printName() {
        System.out.println(name);
    }

    public void careFor() {
        play();
    }

    public void play() {
        System.out.println("pet animal");
    }
}

class Cow extends Animal {

    public void feed() {
        addHay();
    }

    private void addHay() {
        System.out.println("Hay");
    }
}

class Bird extends Animal {

    public void feed() {
        addSeed();
    }

    private void addSeed() {
        System.out.println("Seed");
    }
}

class Lion extends Animal {

    String name = "Leo";

    public void feed() {
        addMeat();
    }

    private void addMeat() {
        System.out.println("Meat");
    }

    public void play() {
        System.out.println("toss in meat");
    }
}

public class Main {

    public void feedAnimal(Animal animal) {
        animal.feed();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.feedAnimal(new Cow());
        main.feedAnimal(new Bird());
        main.feedAnimal(new Lion());

        Animal animal = new Lion();
        animal.printName();
        animal.careFor();
    }
}
