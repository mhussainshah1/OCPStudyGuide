package ocp11.ch08.constructor;

public class Bunny {

    private String color;//null
    private int height;//0
    private int length;//0

    //Constructors
    public Bunny() {
        System.out.println("constructor");
    }

    public Bunny(String color) {
        this.color = color;
    }

    //public bunny() { }// DOES NOT COMPILE
    //Method
    public void Bunny() {

    }

    public Bunny(int length, int theHeight) {
        length = this.length; // backwards – no good!
        height = theHeight; // fine because a different name
        this.color = "white"; // fine, but redundant
    }

    public static void main(String[] args) {
        Bunny b = new Bunny(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);//0 2 white
    }
}
