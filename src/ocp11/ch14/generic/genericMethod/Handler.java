package ocp11.ch14.generic.genericMethod;

class Robot {}

public class Handler {

    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }

    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }

    public static String createName() {
        Crate<Robot> crate = new Crate<>();
        return crate.tricky("bot");
    }

    public static void main(String[] args) {
        ship("package");
        ship(args);
        //or
        Handler.<String>ship("package");
        Handler.<String[]>ship(args);
    }
}
