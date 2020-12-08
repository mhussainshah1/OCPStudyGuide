package ocp11.ch09.abstractclass;

abstract class Bear {

    abstract CharSequence chew();

    public Bear() {
        System.out.println(chew()); // Does this compile?
    }
}

public class Panda extends Bear {

    String chew() {
        return "yummy!";
    }

    public static void main(String[] args) {
        new Panda();
    }
}