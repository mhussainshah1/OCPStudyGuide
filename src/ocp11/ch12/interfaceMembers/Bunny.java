package ocp11.ch12.interfaceMembers;

interface Hop {
    public static int CONSTANT = 1;
    /*public*/ static int getJumpHeight() {//BY DEFAULT
        return 8;
    }
    static int leap() { return 7;  }
    default int test() { return 6;}
}

interface Leap extends Hop {
    static int getJumpHeight() { //BY DEFAULT
        //static methods are not inherited in subinterface
        return Hop.leap();
    }
}

public class Bunny implements Hop, Leap {
    public void printDetails() {
        //static methods are not inherited in class implements interface
//      System.out.println(getJumpHeight()); // DOES NOT COMPILE
//      System.out.println(Bunny.getJumpHeight());// DOES NOT COMPILE
        System.out.println(Hop.getJumpHeight());
        System.out.println(Leap.getJumpHeight());

        //deualt methods are inherited
        System.out.println(test());
    }
}

class Bug{
    public void print(){
        System.out.println(Hop.CONSTANT);
        Hop.getJumpHeight();
    }
}
