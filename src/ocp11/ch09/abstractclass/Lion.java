package ocp11.ch09.abstractclass;

abstract class Animal1 {

    abstract String getName();
}

abstract class BigCat extends Animal1 {

    protected abstract void roar();
}

public class Lion extends BigCat {

    public String getName() {
        return "Lion";
    }

    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}