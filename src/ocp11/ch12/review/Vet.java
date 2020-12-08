package ocp11.ch12.review;

import java.util.List;

interface Yawn {

    String yawn(double d, List<Integer> time);
}

class Sloth implements Yawn {

    public String yawn(double zzz, List<Integer> time) {
        return "Sleep: " + zzz;
    }
}

public class Vet {

    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }

    public static void main(String... unused) {
        System.out.print(takeNap(new Sloth()));
        System.out.println(takeNap((a, b) -> "Sleep: " + (double) (b == null ? a : a)));
    }
}
