package ocp8.ch02.review;

import java.util.function.*;

public class Panda {

    int age;

    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;
        check(p1, p -> p.age < 5); // h1
    }

    private static void check(Panda panda, Predicate<Panda> pred) { // h2
        String result = pred.test(panda) ? "match" : "not match"; // h3
        System.out.print(result);
    }
}
