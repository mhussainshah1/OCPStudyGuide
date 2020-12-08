package ocp11.ch07.pond.goose;

import ocp11.ch07.pond.duck.DuckTeacher;

public class LostDuckling {

    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();                                 // allowed
        System.out.println("Thanks" + teacher.name);    // allowed
    }
}
