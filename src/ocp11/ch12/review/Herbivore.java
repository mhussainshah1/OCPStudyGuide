package ocp11.ch12.review;

public interface Herbivore {

    /*public static final*/ int amount = 10;
    /*public final*/ static boolean gather = true;
    /*public*/static void eatGrass() {}
    int findMore() {return 2;}
    /*public*/ default float rest() {return 2;}
    protected int chew() {return 13;}
    private static void eatLeaves() {}
}
