package ocp11.exam_1Z0_819;

import java.util.List;
import java.util.stream.Stream;

public class Q13 {

    public static void main(String[] args) {
        List<Integer> a = List.of(113, 110);
        List<Integer> b = List.of(112, 113);
        
        /*        
            Stream.of(a, b)
                .flatMap(c -> c.stream().sorted())
                .forEach(i -> System.out.print(i + " "));
        */
        
//        Stream.of(a).map(b -> b.stream()).sorted().forEach(i -> System.out.print(i + " "));
//        Stream.concat(a, b).sorted().forEach(i -> System.out.print(i + " "));
        Stream.of(a, b)
                .flatMap(c -> c.stream())
                .sorted()
                .forEach(i -> System.out.print(i + " "));
    }
}
