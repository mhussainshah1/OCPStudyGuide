package ocp11.ch14.review;

public class Hello<T> {

    T t;

    public Hello(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    private <T> void println(T message) {
        System.out.print(t + "-" + message);
    }

    public static void main(String[] args) {
        new Hello<String>("hi").println(1);
        new Hello("hola").println(true);
    }
}
