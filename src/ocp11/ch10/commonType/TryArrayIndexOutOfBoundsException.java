package ocp11.ch10.commonType;

public class TryArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[-1]);

        int total = 0;
        countsOfMoose = new int[3];
        for (int i = 0; i <= countsOfMoose.length; i++) {
            total += countsOfMoose[i];
        }
    }
}