package ocp8.ch02.functionalInterface;

class Animal1 {
}

@FunctionalInterface
interface Skip extends Sprint {

    public default int getHopCount(Kangaroo kangaroo) {
        return 10;
    }

    public static void skip(int speed) {
    }
}

public class Tiger implements Sprint {

    public void sprint(Animal1 animal) {
        System.out.println("Animal is sprinting fast! " + animal.toString());
    }
}
