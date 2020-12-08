package ocp11.ch03.review;

public class Nineteen {

    public static void main(String[] args) {
        int start = 7;
        int end = 4;
        end += ++start;
        start = (byte) (Byte.MAX_VALUE + 1);
    }
}