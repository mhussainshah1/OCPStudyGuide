package ocp8.ch04.stream;

/**
 * we wanted to get the first two names alphabetically that are four characters
 * long.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Pipeline {

    public static void main(String[] args) {
        //Java 7
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : list) {
            if (name.length() == 4) {
                filtered.add(name);
            }
        }
        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();

        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //Java 8
        list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        /**
         * //It hangs
         * <pre>
         * Stream.generate(() -> "Elsa")
         *          .filter(n -> n.length() == 4)
         *          .sorted()
         *          .limit(2)
         *          .forEach(System.out::println);
         * </pre>
         */

        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

        /**
         * //It hangs
         * <pre>
         * Stream.generate(() -> "Olaf Lazisson")
         *          .filter(n -> n.length() == 4)
         *          .limit(2)
         *          .sorted()
         *          .forEach(System.out::println);
         * </pre>
         */
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::println); // 135

        infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::println);//11233455

        infinite = Stream.iterate(1, x -> x + 1);
        infinite.filter(x -> x % 2 == 1)
                .limit(5)
                .forEach(System.out::print); // 13579

        infinite = Stream.iterate(1, x -> x + 1);
        infinite.filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(System.out::println);//1133557799
    }
}
