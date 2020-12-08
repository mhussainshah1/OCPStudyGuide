package ocp11.ch07.overloadingMethod;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class RefernceType2 {

    public static void print(Iterable i) {
        System.out.print("I");
    }

    public static void print(CharSequence c) {
        System.out.print("C");
    }

    public static void print(Object o) {
        System.out.print("O");
    }

    public static void main(String[] args) {
        print("abc");//C
        print(new ArrayList<>());//I
        print(LocalDate.of(2019, Month.JULY, 4));//O
    }
}