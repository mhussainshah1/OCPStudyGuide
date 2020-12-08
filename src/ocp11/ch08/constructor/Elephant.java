package ocp11.ch08.constructor;

class Mammal {

    public Mammal(int age) {
    }
}

public class Elephant extends Mammal {

    public Elephant() {
//        super();// DOES NOT COMPILE
        super(10);//Mammal(10)
    }
}

class AfricanElephant extends Elephant {

    public AfricanElephant() {
        super();//Elephant()
    }
    
}
