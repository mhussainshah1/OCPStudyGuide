package ocp11.ch05;

import java.util.Arrays;

public class Comparing {

    public static void main(String[] args) {
        //compare()
        System.out.println(Arrays.compare(new int[]{1}, new int[]{2}));

        System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{1}));
        //Positive number - The first element is the same, but the first array is longer.

        System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{1, 2}));
        //Zero -    Exact match

        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"aa"}));
        //Negative number - The first element is a substring of the second.

        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"A"}));
        //Positive number - Uppercase is smaller than lowercase

        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{null}));
        //Positive number  - null is smaller than a letter

        //mismatch()
        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1})); //-1 - Equal

        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));// mismatch at 0

        System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1}));// mismatch at 1
    }
}
