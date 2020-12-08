package ocp11.ch15.review;

import java.util.function.Function;

/**
 *
 * @author m_hus
 */
public class Nineteen {

    public static void main(String[] args) {
        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);
        System.out.println(c.apply(1));
    }

}
