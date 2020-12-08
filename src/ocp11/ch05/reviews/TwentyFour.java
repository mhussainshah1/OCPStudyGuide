package ocp11.ch05.reviews;

import java.util.List;

public class TwentyFour {

    public static void main(String[] args) {
        String[] names = {"Tom", "Dick", "Harry"};
        List<String> list = names.asList();
        list.set(0, "Sue");
        System.out.println(names[0]);
    }
}
