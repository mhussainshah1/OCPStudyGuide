package ocp11.ch10.commonType;

public class TryStackOverflowError {

    public static void main(String[] args) {
        doNotCodeThis(1);
    }

    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }
}
