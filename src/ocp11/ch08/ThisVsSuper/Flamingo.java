package ocp11.ch08.ThisVsSuper;

public class Flamingo {

    private String color;

    public void setColor(String color) {
        this. color = color;
    }

    public static void main(String... unused) {
        Flamingo f = new Flamingo();
        f.setColor("PINK");
        System.out.println(f.color);
    }
}
