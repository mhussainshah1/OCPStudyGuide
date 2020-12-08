package ocp11.ch09.abstractclass;

class Bird {

    public String getName() {
        return null;
    }

    public void printName() {
        System.out.print(getName());
    }
}

public class Stork extends Bird {

    public String getName() {
        return "Stork!";
    }

    public static void main(String[] args) {
        new Stork().printName();
    }
}
