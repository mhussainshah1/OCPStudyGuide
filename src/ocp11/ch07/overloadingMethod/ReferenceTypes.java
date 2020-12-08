package ocp11.ch07.overloadingMethod;

public class ReferenceTypes {

    public void fly(String s) {
        System.out.print("string ");
    }

    public void fly(Object o) {
        System.out.print("object ");
    }

    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(56);
    }
}
