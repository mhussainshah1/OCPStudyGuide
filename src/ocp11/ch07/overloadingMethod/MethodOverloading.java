package ocp11.ch07.overloadingMethod;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading ml = new MethodOverloading();
        ml.fly((short) 1);
        ml.fly(new int[] { 1, 2, 3 });
        ml.fly(1, 2, 3);
        ml.fly(3);
    }

    //Overloaded Method
    public void fly(int numMiles) {
        System.out.println("int");
    }

    public void fly(short numFeet) {
        System.out.println("short");
    }

    public boolean fly() {
        return false;
    }

    void fly(int numMiles, short numFeet) {
    }

    public void fly(short numFeet, int numMiles) throws Exception {
    }
    //public int fly(int numMiles) { } // DOES NOT COMPILE
    //public static void fly(int numMiles) { } // DOES NOT COMPILE
    
    //Varagrs and overloading
    //public void fly(int[] lengths) { }
    public void fly(int... lengths) { } // DOES NOT COMPILE
    
    //Autoboxing
    public void fly(Integer numMiles) { 
        System.out.println("Integer");
    }
    
}
