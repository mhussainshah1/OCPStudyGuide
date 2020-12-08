package ocp11.ch08.review;

public class Rodent {

    public Rodent(var x) {
    }

    protected static Integer chew() throws Exception {
        Object o = 1;
        
        System.out.println("Rodent is chewing");
        return 1;
    }
}

class Beaver extends Rodent {

    public Number chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}
