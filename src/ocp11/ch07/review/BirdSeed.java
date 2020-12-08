package ocp11.ch07.review;

public class BirdSeed {

    private int numberBags;
    boolean call;

    public BirdSeed() {
        // LINE 1
        this(2);
        call = false;
        // LINE 2
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
//	20. Which code can be inserted to have the code print 2?	
//	A. Replace line 1 with BirdSeed(2);
//	B. Replace line 2 with BirdSeed(2);
//	C. Replace line 1 with new BirdSeed(2);
//	D. Replace line 2 with new BirdSeed(2);
//	E. Replace line 1 with this(2);
//	F. Replace line 2 with this(2);