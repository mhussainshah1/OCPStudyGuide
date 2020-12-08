package ocp11.ch08;

class BigCat {

    public double size;
}

public class Jaguar extends BigCat {

    public Jaguar() {
        size = 10.2;
    }

    public void printDetails() {
        System.out.println(size);
    }
}
