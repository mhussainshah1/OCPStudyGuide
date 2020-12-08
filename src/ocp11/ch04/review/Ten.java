package ocp11.ch04.review;

import java.util.ArrayList;
import java.util.List;

public class Ten {

    public static void main(String[] args) {
        for (var penguin : new int[2]) {
            System.out.println(penguin);
        }
        
        var ostrich = new Character[3];
        for (var emu : ostrich) {
            System.out.println(emu);
        }
        
        List parrots = new ArrayList();
        for (var macaw : parrots) {
            System.out.println(macaw);
        }
    }
}