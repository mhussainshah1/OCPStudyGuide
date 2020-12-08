package ocp11.ch09.interfaces;

interface Dances1 {

    int countMoves();
}

interface EatsFish1 {

    boolean countMoves();
}

public class Penguin1 implements Dances1, EatsFish1 { // DOES NOT COMPILE

}
