package ocp11.ch08.review;

public class Howler {

    public Howler(long shadow) {
//        this(3);
        this((short)1);
    }

    private Howler(int moon) {
        super();
    }
}

class Wolf extends Howler {

    protected Wolf(String stars) {
        super(2L);
    }

    public Wolf() {
//        this("");
        this(null);
    }
}