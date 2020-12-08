package ocp8.ch02.functionalInterface;

class Kangaroo extends Animal1 {
}

//Variation of valid interfaces
@FunctionalInterface
interface Sprint {

    public void sprint(Animal1 animal);
}

@FunctionalInterface
interface Run extends Sprint {
}

@FunctionalInterface
interface SprintFaster extends Sprint {

    public void sprint(Animal1 animal);
}
