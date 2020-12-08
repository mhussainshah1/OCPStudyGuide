package ocp11.exam_1Z0_819;
//D
public class Q16 {

    public static void main(String[] args) {
        char d = 100, e = 'e'; // line 1
        int x = d; // line 2
        int y = (int) e; // line 3
        System.out.println(y);
        System.out.println((char) x + (char) y);
    }
}
