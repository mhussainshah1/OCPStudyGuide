package ocp11.ch07.review;

interface Secret {

    String magic(double d);
}

class MySecret implements Secret {

    public String magic(double d) {
        return "Poof";
    }
}
