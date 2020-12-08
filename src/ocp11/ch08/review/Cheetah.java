package ocp11.ch08.review;

class Speedster {

    int numSpots;
}

public class Cheetah extends Speedster {

    int numSpots;

    public Cheetah(int numSpots) {
         super.numSpots =numSpots;
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.print(s.numSpots);
    }
}
