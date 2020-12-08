package ocp8.appendix_B;

public class Cast {

    public static void main(String[] args) {
        //Primative variable
        float value_1 = (float) 102.0;  //Explicit cast        
        float value_2 = 102.0f;         //Implicit Cast

        float value1 = 102;
        float value2 = (int) 102.0;
        //float value3 = 1f * 0.0;
        float value4 = 1f * (short) 0.0;
        //float value5 = 1f * (boolean) 0;

        //Objects
        Object o = new Turtle();
        Mammal m = new Monkey();
        Animal a = new Rabbit();
    }

}

class Animal {
}

class Monkey extends Mammal {
}

class Rabbit extends Animal {
}

class Turtle {
}
