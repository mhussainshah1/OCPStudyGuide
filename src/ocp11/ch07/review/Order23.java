package ocp11.ch07.review;

public class Order23 {

    String value = "t";
    {
        value += "a";//ta
    }

    {
        value += "c";//tac
    }

    public Order23() {
        value += "b";//tacb
    }

    public Order23(String s) {
        value += s;//tacf
    }

    public static void main(String[] args) {
        Order23 order = new Order23("f");//tacf
        order = new Order23();//tacb
        System.out.println(order.value);
    }
}
