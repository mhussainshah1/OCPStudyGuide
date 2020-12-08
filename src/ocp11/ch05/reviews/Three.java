package ocp11.ch05.reviews;

import java.util.ArrayList;
import java.util.List;

public class Three {

    public static void main(String[] args) {
        List<String> gorillas = new ArrayList<>();
        for (var koko : gorillas) {
            System.out.println(koko);
        }
        var monkeys = new ArrayList<>();
        for (var albert : monkeys) {
            System.out.println(albert);
        }
        List chimpanzees = new ArrayList<Integer>();
        for (var ham : chimpanzees) {
            System.out.println(ham);
        }
    }
}
