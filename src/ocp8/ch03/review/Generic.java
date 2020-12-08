package ocp8.ch03.review;

public class Generic<T> {

    public static void main(String[] args) {
        Generic<String> g = new Generic<>();
        Generic<Object> g2 = new Generic();
    }
}