//21. Which of the following complete the constructor so that this code prints out 50? (Choose
//all that apply)
package ocp11.ch07.review;

public class Cheetah {

    int numSpots;

    public Cheetah(int numSpots) {
        // INSERT CODE HERE
        this.numSpots = numSpots;
    }

    public static void main(String[] args) {
        System.out.println(new Cheetah(50).numSpots);
    }
}
//	A. numSpots = numSpots;
//	B. numSpots = this.numSpots;
//	C. this.numSpots = numSpots;
//	D. numSpots = super.numSpots;
//	E. super.numSpots = numSpots;
//	F. None of the above.
