package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;

class SuperClass {}
class MyClasss extends SuperClass {}
class ChildClass extends MyClasss {}

public class GrandChildClass extends ChildClass {
    public static void main(String[] args) {
        List<? super ChildClass> child = new ArrayList<MyClasss>();
        child.add(new MyClass());
        child.add(new ChildClass());
        child.add(new GrandChildClass());
    }
}