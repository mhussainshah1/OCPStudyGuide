package ocp11.ch08.polymorphism;

class Marsupial {

    protected int age = 2;

    public static boolean isBiped() {
        return false;
    }
}

public class Kangaroo extends Marsupial {

    protected int age = 6;

    public static boolean isBiped() {
        return true;
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        Marsupial moey = joey;
        System.out.println(joey.isBiped());
        System.out.println(moey.isBiped());
        System.out.println(joey.age);
        System.out.println(moey.age);
    }
}
