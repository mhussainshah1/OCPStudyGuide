package ocp11.ch08.review;

import java.util.ArrayList;
import java.util.List;

public class Alpaca {

    protected List<String> hairy(int p) {
        return null;
    }
}

class child extends Alpaca {
//    List<String> hairy(int p) {
//        return null;
//    }

    @Override
    public List<String> hairy(int p) {
        return null;
    }

//    public List<CharSequence> hairy(int p) {
//        return null;
//    }
//    private List<String> hairy(int p) {
//        return null;
//    }
//    public Object hairy(int p) {
//        return null;
//    }
}

class child2 extends Alpaca {

    @Override
    public ArrayList<String> hairy(int p) {
        return null;
    }
}