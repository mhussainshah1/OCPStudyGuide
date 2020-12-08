package ocp8.ch02.review;

public interface CanHop {
}

class Frog implements CanHop {

    public static void main(String[] args) {
        Frog frog1 = new TurtleFrog();
        TurtleFrog frog2 = new TurtleFrog();
        CanHop frog3 = new TurtleFrog();
        Object frog4 = new TurtleFrog();
    }
}

class BrazilianHornedFrog extends Frog {
}

class TurtleFrog extends Frog {
}
