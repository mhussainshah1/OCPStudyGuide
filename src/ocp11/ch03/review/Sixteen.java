package ocp11.ch03.review;

public class Sixteen {

    public static void main(String[] args) {
        int note = 1 * 2; //+ (long)3;
        short melody = (byte) (double) (note *= 2);
        double song = melody;
        float symphony = (float) ((song == 1_000f) ? song * 2L : song);
    }
}
