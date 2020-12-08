package ocp11.ch07.review;

import static ocp11.ch07.review.rope.Rope.LENGTH;
import ocp11.ch07.review.rope.Rope;

public class Chimp {

    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();
        System.out.println(LENGTH);
    }
}
