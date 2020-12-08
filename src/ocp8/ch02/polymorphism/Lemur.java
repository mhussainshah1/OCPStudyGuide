package ocp8.ch02.polymorphism;

class Primate {

    public boolean hasHair() {
        return true;
    }
}

interface HasTail {

    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {

    public int age = 10;

    @Override
    public boolean isTailStriped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        
        /**
         * Rule - 1
         * Up-Casting: Casting an object from a subclass to a superclass doesn’t 
         * require an explicit cast.
         */
        HasTail hasTail = lemur;//Up Casting
        System.out.println(hasTail.age); // DOES NOT COMPILE
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
        System.out.println(primate.hasHair());

        Lemur lemur2 = primate; // DOES NOT COMPILE

        /**
         * Rule - 2
         * Down- Casting: Casting an object from a superclass to a subclass 
         * requires an explicit cast.
         */
        Lemur lemur3 = (Lemur) primate;// Down Casting
        System.out.println(lemur3.age);
    }
}
