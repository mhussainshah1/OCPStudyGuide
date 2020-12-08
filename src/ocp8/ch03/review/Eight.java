package ocp8.ch03.review;

import java.util.TreeSet;

public class Eight {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
    }
}
