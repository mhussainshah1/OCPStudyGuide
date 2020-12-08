package ocp11.ch09.review;

abstract class Nocturnal {
    boolean isBlind();
}

public class Owl extends Nocturnal {

    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        var nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());
    }
}
