package ocp11.ch05;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(numbers);

        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
}
