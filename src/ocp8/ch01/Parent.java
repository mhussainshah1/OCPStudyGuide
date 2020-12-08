package ocp8.ch01;

import java.io.IOException;

public class Parent {

    protected static Number method(String name) throws Exception {
        System.out.println("Parent Method");
        return 1;
    }
}

class Child extends Parent {

//    @Override
    public final static Integer method(String name) throws IOException {
        System.out.println("Child Method");
        return 2;
    }
}
