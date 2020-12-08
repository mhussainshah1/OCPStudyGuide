package ocp11.ch12.functionalProgramming;

import java.util.*;
import java.util.function.Predicate;

public class TraditionalSearch {

    public static void main(String[] args) {

        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        Predicate<Animal> checker = (Animal a) -> { return a.canHop(); };                                 
			  checker = (a) -> { return a.canHop(); };
			  checker = a -> { return a.canHop(); };
			  checker = a ->  a.canHop();
                          checker = (a) -> a.canHop();  
                          checker = (Animal a) -> a.canHop();  
                          checker = Animal::canHop;

        // Pass lambda that does check
        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim()); 
        print(animals, a -> !a.canSwim());

    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
    }
}
