package ocp11.ch10.review;

public class Dog {

    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch (NumberFormatException e) {
            System.out.print("4");
        }
    }

    public static void main(String[] args) {
        Dog leroy = new Dog();
        leroy.name = "Leroy";
        leroy.parseName();
        System.out.print("5");
    }
}
