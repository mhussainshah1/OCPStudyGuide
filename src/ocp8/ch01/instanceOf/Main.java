package ocp8.ch01.instanceOf;

class HeavyAnimal {
}

class Hippo extends HeavyAnimal {
}

class Elephant extends HeavyAnimal {
}

interface Mother {
}

class MotherHippo extends Hippo implements Mother {
}

public class Main {

    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;//true
        boolean b2 = hippo instanceof HeavyAnimal;//true
        boolean b3 = hippo instanceof Elephant;//false

        boolean b4 = hippo instanceof Object;//true
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object;//false

        Hippo anotherHippo = new Hippo();

        //Compiler check Class at compile time
        boolean b6 = anotherHippo instanceof Elephant;
        //Compiler check interface at runtime
        boolean b7 = hippo instanceof Mother;
    }
}
