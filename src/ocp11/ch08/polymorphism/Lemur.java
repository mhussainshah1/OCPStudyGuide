package ocp11.ch08.polymorphism;

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
    public boolean isTailStriped() {
        return false;
    }

    public static void main(String[] args) {
        //1:- object reference with the same type as the object
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        //2:- object reference pass into interface reference
        HasTail hasTail = lemur;//Implicit cast
        System.out.println(hasTail.isTailStriped());
//        System.out.println(hasTail.age); // DOES NOT COMPILE

        //3:- object reference pass into superclass reference
        Primate primate = lemur; //Implicit Cast
        System.out.println(primate.hasHair());
//        System.out.println(primate.isTailStriped()); // DOES NOT COMPILE

        Object lemurAsObject = lemur;

//        Lemur lemur2 = primate; // DOES NOT COMPILE
        Lemur lemur3 = (Lemur) primate; //Explicit cast
        System.out.println(lemur3.age);
    }
}
