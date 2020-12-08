package ocp8.ch01.enums;

public enum OnlyOne {
    //construct all of the enum values
    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        //return already constructed enum values
        OnlyOne firstCall = OnlyOne.ONCE;
        OnlyOne secondCall = OnlyOne.ONCE;
        System.out.println(firstCall + " " + secondCall);
    }
}
