package ocp11.ch04;

public class ProperSwitch {
    public static void main(String[] args) {
        int month = 3;
//        switch month { // DOES NOT COMPILE
//        case 1: System.out.print("January");
//        }
//        switch (month) // DOES NOT COMPILE
//        case 1: System.out.print("January");
//        
//        switch (month) {
//        case 1: 2: System.out.print("January"); // DOES NOT COMPILE
//        }
        
        switch (month) {
        case 1 | 2: System.out.print("January"); // DOES NOT COMPILE
        }
    }
}
