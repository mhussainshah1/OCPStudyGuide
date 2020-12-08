package ocp11.ch14.review;

class W {
}

class X extends W {
}

class Y extends X {
}

public class Z<Y> {

    public static void main(String[] args) {
        W w1 = new W();
        W w2 = new X();
        W w3 = new Y();
        Y y1 = new W();
        Y y2 = new X();
        Y y1 = new Y();
    }
}
