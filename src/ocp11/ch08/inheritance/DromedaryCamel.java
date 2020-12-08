package ocp11.ch08.inheritance;

class Camel1 {

    private String getNumberOfHumps() {
        return "Undefined";
    }
}

public class DromedaryCamel extends Camel1 {

    private int getNumberOfHumps() {
        return 1;
    }
}