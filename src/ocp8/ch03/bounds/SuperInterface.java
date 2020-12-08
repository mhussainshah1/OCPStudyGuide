package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;

public interface SuperInterface {}
interface Interface extends SuperInterface {}

class MyClass implements Interface {
    public static void main(String[] args) {
        List<? super Interface> test = new ArrayList<SuperInterface>();
    }
}