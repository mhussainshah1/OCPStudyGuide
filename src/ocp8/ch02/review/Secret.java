package ocp8.ch02.review;

import java.util.function.Function;

public interface Secret {

    String magic(double d);
}

class MySecret implements Secret {

    public String magic(double d) {
        return "Poof";
    }
}
class Eleven{
    public static void main(String[] args) {
        Function<Double,String> function = (e) -> "Proof";
        function = (e) -> { String f = ""; return "Poof"; };
    }
}