package ocp8.ch03.java8;

import java.util.Comparator;
import ocp11.ch14.sortedData.Comparable.Duck;

public class DuckHelper {

    public static int compareByWeight(Duck d1, Duck d2) {
        return d2.getWeight() - d1.getWeight();
    }

    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }

    public static void main(String[] args) {
        //Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        
        Comparator<Duck> byWeight = DuckHelper::compareByWeight;
    }
}
