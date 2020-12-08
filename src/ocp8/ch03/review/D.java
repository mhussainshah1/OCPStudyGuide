package ocp8.ch03.review;

class A {
}

class B extends A {
}

class C extends B {
}

public class D<C> {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();
        C c1 = new A();
        C c2 = new B();
        C c1 = new C();
    }
}
