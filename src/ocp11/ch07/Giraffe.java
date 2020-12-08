package ocp11.ch07;

public class Giraffe {

    public void eat(Giraffe g) {
        allGiraffeComeOut();
        drink();
        g.eat(g);
    }

    public void drink() {
    }

    public static void allGiraffeGoHome(Giraffe g) {
        allGiraffeComeOut();
        drink();
        g.eat(g);
    }

    public static void allGiraffeComeOut() {
    }
}
