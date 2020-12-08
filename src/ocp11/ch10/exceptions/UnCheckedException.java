package ocp11.ch10.exceptions;

public class UnCheckedException {

    public static void main(String[] args) {
        new UnCheckedException().fall(null); 
    }

    void fall(String input) {
        System.out.println(input.toLowerCase());//NullPointerException
    }
}
