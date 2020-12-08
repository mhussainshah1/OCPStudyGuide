package ocp11.ch05;

import java.util.Arrays;

public class ArrayType {

    public static void main(String args[]) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
        System.out.println(Arrays.toString(bugs));

        String[] str1 = new String[2];
        String[] str2 = {"1", "2"};
        int i = 0;
        for (String s : str1) {
            s.concat("element "+str1[i]);
            i++;
        }

    }
}
