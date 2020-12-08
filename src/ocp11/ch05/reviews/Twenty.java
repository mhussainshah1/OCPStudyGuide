package ocp11.ch05.reviews;

import java.util.Arrays;
import java.util.List;

public class Twenty {

    public static void main(String[] args) {
        double one = Math.pow(1, 2);
        int two = Math.round(1.0);
        float three = Math.random();
        var doubles = new double[]{one, two, three};

        String[] names = {"Tom", "Dick", "Harry"};
        List<String> list = names.asList();
        var other = Arrays.asList(names);
        other.set(0, "Sue");
    }
}
