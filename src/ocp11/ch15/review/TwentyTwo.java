package ocp11.ch15.review;

import java.util.Optional;

public class TwentyTwo {

    public static void main(String[] args) {
        Optional<Double> opt= average();
        opt.orElse("");
        opt.orElseGet(() -> "");
        opt.orElseThrow();
        opt.orElseThrow(() -> throw new Exception());
        opt.orElseThrow(RuntimeException::new);
        opt.get();
        opt.get("");
    }
}
