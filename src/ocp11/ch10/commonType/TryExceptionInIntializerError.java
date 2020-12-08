package ocp11.ch10.commonType;

public class TryExceptionInIntializerError {

    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }
}