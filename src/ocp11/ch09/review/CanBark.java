package ocp11.ch09.review;

interface Dog extends CanBark, HasVocalCords {

    abstract int chew();
}

public interface CanBark extends HasVocalCords {

    public void bark();
}

interface HasVocalCords {

    public abstract void makeSound();
}