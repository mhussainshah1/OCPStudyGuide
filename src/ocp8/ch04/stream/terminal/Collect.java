package ocp8.ch04.stream.terminal;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);

        stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]

        stream = Stream.of("w", "o", "l", "f");
        set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]

        stream = Stream.of("w", "o", "l", "f");
        Set<String> set1 = stream.collect(Collectors.toSet());
        System.out.println(set1); // [f, w, l, o]
    }
}