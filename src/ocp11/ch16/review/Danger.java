package ocp11.ch16.review;

class Danger extends RuntimeException {

    public Danger(String message) {
        super();
    }

    public Danger(int value) {
        super((String) null);
    }
}

class Catastrophe extends Exception {

    public Catastrophe(Throwable c) throws RuntimeException {
        super(new Exception());
        c.printStackTrace();
    }
}

class Emergency extends Danger {

    public Emergency() {
    }

    public Emergency(String message) {
        super(message);
    }
}
