package ocp8.ch03.generic;

public class SizeLimitedCrate<T, U> {

    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        if(T instanceof U){
            System.out.println("Not Allowed");
        }
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}
