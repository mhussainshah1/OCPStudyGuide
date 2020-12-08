package ocp8.ch02.polymorphism;

class Bird {
}

public class Fish {

    public static void main(String[] args) {
        Fish fish = new Fish();
        /**
         * Rule -3
         * The compiler will not allow casts to unrelated types.
         */
        Bird bird = (Bird) fish; // DOES NOT COMPILE 
    }
}
