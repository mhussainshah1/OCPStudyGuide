package ocp11.ch03.review;

public class Nine {

    public static void main(String[] args) {
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++);
        System.out.println(b = (a != c ? a : b++));
        System.out.println(a > b ? b < c ? b : 2 : 1);
    }
}
