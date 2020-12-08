package ocp8.ch01.review;

public interface Otter {

    default void play() {
    }
}

class RiverOtter implements Otter {

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 42;//not legal
    }

    @Override
    public void play() {
    }
}
