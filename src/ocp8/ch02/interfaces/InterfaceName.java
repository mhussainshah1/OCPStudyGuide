package ocp8.ch02.interfaces;

public interface InterfaceName {

    int CONSTANT_NAME = 1;

    int abstractMethod();

    static int staticMethod() {
        int a = privateStaticMethod();
        return a;
    }

    default double defaultMethod() {
        int b = privateMethod(), c = privateStaticMethod();
        return b * c;
    }

    private int privateMethod() {
        return 3;
    }

    private static int privateStaticMethod() {
        return 4;
    }
}
