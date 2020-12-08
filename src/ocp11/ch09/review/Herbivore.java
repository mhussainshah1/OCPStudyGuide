package ocp11.ch09.review;

public abstract interface Herbivore {

    int amount = 10;

    public void eatGrass();

    public abstract int chew() {
        return 13;
    }
}

abstract class IsAPlant extends Herbivore {

    Object eatGrass(int season) {
        return null;
    }
}
