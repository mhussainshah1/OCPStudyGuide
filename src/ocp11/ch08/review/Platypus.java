package ocp11.ch08.review;

class Mammal {

    private void sneeze() {
    }

    public Mammal(int age) {
        System.out.print("Mammal");
    }
}

public class Platypus extends Mammal {

    int sneeze() {
        return 1;
    }

    public Platypus() {
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
