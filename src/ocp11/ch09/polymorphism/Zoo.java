package ocp11.ch09.polymorphism;

import java.util.*;

public class Zoo {

    public void sortAndPrintZooAnimals(List<String> animals) {
        Collections.sort(animals);
        for (String a : animals) {
            System.out.println(a);
        }
    }
}
