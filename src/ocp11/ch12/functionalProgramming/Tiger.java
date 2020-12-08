package ocp11.ch12.functionalProgramming;

@FunctionalInterface
interface Sprint {
    public void sprint(int speed);
}

public class Tiger implements Sprint {
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}