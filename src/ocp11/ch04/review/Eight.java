package ocp11.ch04.review;

public class Eight {
    public static void main(String[] args) {
        int sing = 8, squawk = 2, notes = 0;
        while (sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes);
    }
}