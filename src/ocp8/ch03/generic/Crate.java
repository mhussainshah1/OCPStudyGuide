package ocp8.ch03.generic;

public class Crate<T> {

    private T contents;
    private T[] array;
//    private static T constant;
    
    public T emptyCrate() {
//        array = new T[4];
//        T t = new T();        
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }
    
    public Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<>();
    }
}

/**
 * Type Erasure
 * ------------
 * The compiler converted above class into the following,So the code to be 
 * compatible with older version of java do not contain generics.
   
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