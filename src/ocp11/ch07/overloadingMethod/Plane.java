package ocp11.ch07.overloadingMethod;

public class Plane {

    public void fly(int i) {
        System.out.print("int ");
    }

    public void fly(long l) {
        System.out.print("long ");
    }

    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
    }
}
