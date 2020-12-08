package ocp11.ch07;

import java.util.ArrayList;

public class Initializers {

    private static int counter = 0; // initialization
    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        NUM_BUCKETS = 5; // DOES NOT COMPILE
        values.add("changed");
        values = new ArrayList<String>();// DOES NOT COMPILE
    }
}