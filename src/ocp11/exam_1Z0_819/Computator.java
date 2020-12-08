package ocp11.exam_1Z0_819;

import java.util.Collection;
import java.util.List;
//E
// Line 1
public class Computator<N extends Number, C extends Collection<N>> {

    public Double sum(C collection) { // Line 2
        double sum = 0.0; // line 3
        for (N n : collection) { // Line 4
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String... args) {
        var numbers = List.of(5, 4, 6, 3, 7, 2, 8, 1, 9); // Line 5
        Computator<Integer, List<Integer>> c = new Computator<>();
        System.out.println(c.sum(numbers));
    }
}
