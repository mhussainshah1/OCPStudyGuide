package ocp11.ch08.inheritance;

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
}

public class Panda extends Bear {
//    public static void eat() {
//        System.out.println("Panda is chewing");
//    }

    public static void main(String[] args) {
        eat();
    }
}
