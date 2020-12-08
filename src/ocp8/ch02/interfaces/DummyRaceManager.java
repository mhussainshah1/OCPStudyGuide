package ocp8.ch02.interfaces;

//Interface development team
import java.util.List;

class Animal {
}

class Tortoise extends Animal {
}

class Hare extends Animal {
}

interface RaceManager {

    public Animal getWinner(List<Animal> animals);
}

//Testing you own code with Dummy class object
public class DummyRaceManager implements RaceManager {

    @Override
    public Animal getWinner(List<Animal> animals) {
        return animals == null || animals.isEmpty() ? null : animals.get(0);
    }
}
