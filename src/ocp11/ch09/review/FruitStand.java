package ocp11.ch09.review;

interface Apple {
}

interface Orange {
}

class Gala implements Apple {
}

class Tangerine implements Orange {
}

final class Citrus extends Tangerine {
}

public class FruitStand {

    public static void main(String... farm) {
        Gala g = new Gala();
        Tangerine t = new Tangerine();
        Citrus c = new Citrus();
        System.out.print(t instanceof Gala);
        System.out.print(c instanceof Tangerine);//true
        System.out.print(g instanceof Apple);//true
        System.out.print(t instanceof Apple);//false
        System.out.print(c instanceof Apple);
    }
}
