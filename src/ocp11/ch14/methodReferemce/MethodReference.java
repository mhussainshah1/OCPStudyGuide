package ocp11.ch14.methodReferemce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {

    public static void main(String[] args) {
        //Calling Static Method
        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = x -> Collections.sort(x);

        //Calling Instance Method on a particular object
        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.startsWith(s);

        //Instance methods on a Parameter
        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        BiPredicate<String, String> methodRef32 = String::startsWith;
        BiPredicate<String, String> lambda32 = (s, p) -> s.startsWith(p);

        //Constructors
        Supplier<List<String>> methodRef4 = ArrayList::new;
        Supplier<List<String>> lambda4 = () -> new ArrayList();
        
        Function<Integer, List<String>> methodRef42 = ArrayList::new;
        Function<Integer, List<String>> lambda42 = x -> new ArrayList(x);
    }
}
