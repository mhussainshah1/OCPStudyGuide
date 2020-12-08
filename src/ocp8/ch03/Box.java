package ocp8.ch03;

import ocp8.ch03.generic.Crate;

public class Box {

    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<>();
    }

    public static <T> void sink(T t) {
    }

    public static <T> T identity(T t) {
        return t;
    }

//    public static T noGood(T t) {return t;} // DOES NOT COMPILE

    public static void main(String[] args) {
        Box.sink(args);
        Box.<String>ship("package");
        Box.<String[]>ship(args);
    }
}
