package ocp11.ch05;

import java.util.Arrays;

public class Searching {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        numbers = new int[]{3, 2, 1};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 2
        System.out.println(Arrays.binarySearch(numbers, 3)); // -4
    }
}
