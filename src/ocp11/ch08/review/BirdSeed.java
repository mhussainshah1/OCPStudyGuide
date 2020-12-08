package ocp11.ch08.review;

public class BirdSeed {

    private int numberBags;
    boolean call;

    public BirdSeed() {
        this(2); // LINE 1
        call = false;
        // LINE 2
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.print(seed.numberBags);
    }
}
