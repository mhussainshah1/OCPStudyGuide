package ocp11.ch08.polymorphism;

class Penguin3 {

    public static int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.println(this.getHeight());
    }
}

public class CrestedPenguin extends Penguin3 {

    public static int getHeight() {
        return 8;
    }

    public static void main(String... fish) {
        new Penguin3().printInfo();
        new CrestedPenguin().printInfo();
    }
}
