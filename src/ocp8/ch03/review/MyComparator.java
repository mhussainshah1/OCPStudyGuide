package ocp8.ch03.review;

import java.util.*;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int c = b.toLowerCase().compareTo(a.toLowerCase());
        String r = (c < 0) ? " smaller " : " larger ";
        System.out.println(a + r + b);
        return c;
    }

    public static void main(String[] args) {
        String[] values = {"123", "Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        for (String s : values) {
            System.out.print(s + " ");
        }
    }
}
