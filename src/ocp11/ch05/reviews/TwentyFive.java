package ocp11.ch05.reviews;

import java.util.Arrays;

public class TwentyFive {

    public static void main(String[] args) {
        String[] s1 = {"Camel", "Peacock", "Llama"};
        String[] s2 = {"Camel", "Llama", "Peacock"};
        String[] s3 = {"Camel"};
        String[] s4 = {"Camel", null};
        System.out.println(Arrays.compare(s2, s1));//4
        System.out.println(Arrays.mismatch(s1, s2));//1
        System.out.println(Arrays.compare(s3, s4));//-1
        System.out.println(Arrays.mismatch(s4, s3));//1
        System.out.println(Arrays.compare(s4, s4));//0 - arrays are equal
        System.out.println(Arrays.mismatch(s4, s4));//-1 - arrays are equal
    }
}