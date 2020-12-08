package ocp11.ch08.initialization;

class Animal {

    static {
        System.out.print("A");
    }
}

public class Hippo extends Animal {

    static {
        System.out.print("B");
    }

    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
}
