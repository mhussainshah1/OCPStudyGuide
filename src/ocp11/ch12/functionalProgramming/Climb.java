package ocp11.ch12.functionalProgramming;

@FunctionalInterface
interface Dash extends Sprint {}

//@FunctionalInterface
interface Skip extends Sprint {
    void skip();
}

//@FunctionalInterface
interface Sleep {
    private void snore() {
    }
    default int getZzz() {
        return 1;
    }
}

@FunctionalInterface
public interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() {
        return 100;
    }
    private static boolean checkHeight() {
        return true;
    }
}