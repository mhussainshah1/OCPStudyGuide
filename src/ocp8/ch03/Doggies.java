package ocp8.ch03;

import java.util.*;

class Doggies {

    List<String> names;

    Doggies() {
        names = new ArrayList<>(); // matches instance variable declaration
    }

    public void copyNames() {
        ArrayList<String> copyOfNames;
        copyOfNames = new ArrayList<>(); // matches local variable declaration
    }
}