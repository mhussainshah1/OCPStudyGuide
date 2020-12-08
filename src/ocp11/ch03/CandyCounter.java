package ocp11.ch03;

public class CandyCounter {

    static long addCandy(double fruit, float vegetables) {
        return (int) fruit + vegetables;
    }

    public static void main(String[] args) {
        System.out.print(addCandy(1.4, 2.4f) + "-");
        System.out.print(addCandy(1.9, (float) 4) + "-");
        System.out.print(addCandy((long) (int) (short) 2, (float) 4));
    }
}