package ocp11.ch08.review;

class Primate1 {

    protected int age = 2;

    {
        age = 1;
    }

    public Primate1() {
        this().age = 3;
    }
}

public class Orangutan {

    protected int age = 4;

    {
        age = 5;
    }

    public Orangutan() {
        this().age = 6;
    }

    public static void main(String[] bananas) {
        final Primate1 x = (Primate1) new Orangutan();
        System.out.println(x.age);
    }
}
