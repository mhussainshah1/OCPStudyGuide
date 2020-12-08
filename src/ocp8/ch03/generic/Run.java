package ocp8.ch03.generic;

class Robot {}

class Elephant {}

class Zebra {}

public class Run {

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();

        Crate<Zebra> crateForZebra = new Crate<>();

        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);
        // ship to St. Louis
        Robot atDestination = robotCrate.emptyCrate();

        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant,
                numPounds);
        
        Robot r = robotCrate.emptyCrate();
        /**
         * Compiler adds the relevant cast to work with type of erased class        
        Robot r = (Robot) robotCrate.emptyCrate();
        */
        
        Crate<int> number = new Crate<>();
    }
}