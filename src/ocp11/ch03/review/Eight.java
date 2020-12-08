package ocp11.ch03.review;

public class Eight {

    public static void main(String[] args) {
        int pig = (short) 4;
        pig = pig++;
        System.out.println(pig++ < 5);
        long goat = (int) 2;
        goat -= 1.0;
        System.out.println(pig + " - " + goat);
    }
}