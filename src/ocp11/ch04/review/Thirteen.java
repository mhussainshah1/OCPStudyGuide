package ocp11.ch04.review;

public class Thirteen {

    public static void main(String[] args) {
        int participants = 4, animals = 2, performers = -1;
        while ((participants = participants + 1) < 10) {
        }
        
        do {
        } while (animals++ <= 1);
        
        for (; performers < 2; performers += 2) {
        }
        
        System.out.println(participants);
        System.out.println(animals);
        System.out.println(performers);
    }
}
