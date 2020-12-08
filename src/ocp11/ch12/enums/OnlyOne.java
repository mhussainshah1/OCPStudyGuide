package ocp11.ch12.enums;

public enum OnlyOne {
    //construct all of the enum values
    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.println("constructing");
    }
}

class PrintTheOne {
    public static void main(String[] args) {
        //return already constructed enum values
        OnlyOne firstCall = OnlyOne.ONCE;  // prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything
        System.out.println(firstCall + " " + secondCall);
    }
}