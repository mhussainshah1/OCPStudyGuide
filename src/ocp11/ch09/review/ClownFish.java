package ocp11.ch09.review;

interface Aquatic {
    int getNumOfGills(int p);
}

public class ClownFish implements Aquatic {
    String getNumOfGills() {
        return "14";
    }

    int getNumOfGills(int input) {
        return 15;
    }

    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumOfGills(-1));
    }
}
