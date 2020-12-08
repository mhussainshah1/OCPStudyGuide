package ocp11.ch04.review;

public class Nine {

    public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, meters = 10;
        do {
            meters--;
            if (meters == 8) {
                keepGoing = false;
            }
            result -= 2;
        } while (keepGoing);
        System.out.println(result);
    }
}