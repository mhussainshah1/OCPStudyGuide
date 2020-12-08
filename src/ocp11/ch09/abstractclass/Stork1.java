package ocp11.ch09.abstractclass;

abstract class Bird1 {

    public abstract String getName();
    public void printName() {
        System.out.print(getName());
    }
}

public class Stork1 extends Bird1 {
    public String getName() {
        return "Stork!";
    }
    public static void main(String[] args) {
        new Stork1().printName();
    }
}

class Stork2 extends Bird1{}