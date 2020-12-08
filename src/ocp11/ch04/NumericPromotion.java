package ocp11.ch04;

public class NumericPromotion {

    public static void main(String[] args) {
        short size = 4;
        final int small = 15;
        final int big = 1_000_000;
        
        size = small;
        
        switch (size) {
            case small:
            case 1 + 2:
//            case big: // DOES NOT COMPILE
        }
    }
}
