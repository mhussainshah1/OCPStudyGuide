package ocp11.ch16.review;

class Problem extends Exception {

    public Problem() {
    }
}

class YesProblem extends Problem {
}

public class MyDatabase {

    public static void connectToDatabase() throw Problem {
        throws new YesProblem();
    }

    public static void main(String[] c) throw Exception {
        connectToDatabase();
    }
}
