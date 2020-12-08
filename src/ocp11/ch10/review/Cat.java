package ocp11.ch10.review;

public class Cat {

    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
        }
        System.out.print("5");
    }

    public static void main(String[] args) {
        Cat leo = new Cat();
        leo.name = "Leo";
        leo.parseName();
        System.out.print("6");
    }
}
