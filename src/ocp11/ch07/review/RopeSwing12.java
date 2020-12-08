//12. What is the output of the following code?
package ocp11.ch07.review;

import ocp11.ch07.review.rope.Rope12;

public class RopeSwing12 {
    private static Rope12 rope1 = new Rope12();
    private static Rope12 rope2 = new Rope12();

    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }
}