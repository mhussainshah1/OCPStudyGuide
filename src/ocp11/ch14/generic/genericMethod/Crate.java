package ocp11.ch14.generic.genericMethod;

public class Crate<T> {

    public <T> T tricky(T t) {
        return t;
    }
}


