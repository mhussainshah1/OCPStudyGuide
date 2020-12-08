package ocp11.ch14.generic.genericClasses;

public class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;
    private T[] array;
    private static T constant;

    public SizeLimitedCrate() {
        contents = new T();
        array = new T[4];

        if (T instanceof U) {
            System.out.println("Not Allowed");
        }
    }

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1
                = new SizeLimitedCrate<>(elephant, numPounds);

        SizeLimitedCrate<Elephant, int> c2
                = new SizeLimitedCrate<>(elephant, numPounds);
    }
}
