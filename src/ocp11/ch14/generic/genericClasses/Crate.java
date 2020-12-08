package ocp11.ch14.generic.genericClasses;

public class Crate<T> {

    private T contents;
    
    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }
}
/**
 * Type Erasure:
 * The compiler converted above class into the following,So the code to be
 * compatible with older version of java do not contain generics.
 */
/*
public class Crate {

    private Object contents;

    public Object emptyCrate() {
        return contents;
    }

    public void packCrate(Object contents) {
        this.contents = contents;
    }
}
 */
