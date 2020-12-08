package ocp11.ch03.review;

public class Seven {

    public static void main(String[] args) {
        int ph = 7, vis = 2;
        boolean clear = vis > 1 & (vis < 9 || ph < 2);
        boolean safe = (vis > 2) && (ph++ > 1);
        boolean tasty = 7 <= --ph;
        System.out.println(clear + "-" + safe + "-" + tasty);
    }
}