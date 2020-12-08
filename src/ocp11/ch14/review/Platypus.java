package ocp11.ch14.review;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Platypus {

    String name;
    int beakLength;

    // Assume getters/setters/constructors provided
    public Platypus(String name, int beakLength) {
        this.name = name;
        this.beakLength = beakLength;
    }

    public String getName() {
        return name;
    }

    public int getBeakLength() {
        return beakLength;
    }

    public String toString() {
        return "" + beakLength;
    }

    public static void main(String[] args) {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);
        
        /*
        Collections.sort(list, Comparator
                                    .comparing(Platypus::getBeakLength)
                                    .reversed());//7, 5, 3
        */
            
         /*
        Collections.sort(list, Comparator
                                    .comparing(Platypus::getName)
                                    .thenComparing(Comparator.comparing(Platypus::getBeakLength)
                                    .reversed())); //3, 7, 5
         */
         
        Collections.sort(list, Comparator
                                    .comparing(Platypus::getName)
                                    .thenComparingInt(Platypus::getBeakLength)
                                    .reversed());//7,5,3
        
        System.out.println(list);
    }
}
