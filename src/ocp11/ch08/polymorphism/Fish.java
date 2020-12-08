package ocp11.ch08.polymorphism;

class Bird {
}

public class Fish {

    public static void main(String[] args) {
        Fish fish = new Fish();
        if(fish instanceof Bird){// DOES NOT COMPILE
            Bird bird = (Bird) fish; // DOES NOT COMPILE
        }        
    }
}