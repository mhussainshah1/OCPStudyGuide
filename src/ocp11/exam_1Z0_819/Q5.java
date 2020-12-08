package ocp11.exam_1Z0_819;

class A {

    public void print() {
        System.out.println("A");
    }

}

class B extends A {

    public void print() {
        System.out.println("B");
    }
}

class C extends A{
    public void print() {
        System.out.println("B");
    }
}

public class Q5 {

    public static void main(String[] args) {
        A[] values = new B[2];
        values[0] = new C();
        values[0].print();
    }
}
