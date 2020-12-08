package ocp11.ch05;

public class Maths {

    public static void main(String[] args) {
        int first = Math.max(3, 7); // 7
        int second = Math.min(7, -9); // -9

        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloat = Math.round(123.45f); // 123
        
        double squared = Math.pow(5, 2); // 25.0
        
        double num = Math.random();
    }
}