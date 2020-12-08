package ocp8.ch04;

import java.util.Optional;

public class MyOptional {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {

        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average()); // Optional.empty

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent()) {
            System.out.println(opt.get()); // 95.0
        }
        opt.ifPresent(System.out::println);

        Optional<Double> opt1 = average();
        //System.out.println(opt1.get()); // bad

        String value = "";
        Optional o = (value == null) ? Optional.empty() : Optional.of(value);

        Optional o1 = Optional.ofNullable(value);

        Optional<Double> opt2 = average();
        System.out.println(opt2.orElse(Double.NaN));
        System.out.println(opt2.orElseGet(() -> Math.random()));
        //System.out.println(opt2.orElseThrow(() -> new IllegalStateException()));
        //System.out.println(opt.orElseGet(() -> new IllegalStateException())); // DOES NOT COMPILE

        Optional<Double> opt3 = average(90, 100);
        System.out.println(opt3.orElse(Double.NaN));
        System.out.println(opt3.orElseGet(() -> Math.random()));
        System.out.println(opt3.orElseThrow(() -> new IllegalStateException()));
    }
}
