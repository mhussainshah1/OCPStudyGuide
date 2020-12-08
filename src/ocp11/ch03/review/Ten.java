package ocp11.ch03.review;

public class Ten {

    public static void main(String[] args) {
        short height = 1, weight = 3;
        short zebra = (byte) weight * (byte) height;
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
        System.out.println(zebra);
        System.out.println(ox);
        System.out.println(giraffe);
    }
}
