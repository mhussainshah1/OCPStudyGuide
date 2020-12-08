package ocp11.ch09.review;

import java.util.ArrayList;
import java.util.List;

interface Walk {
    public List move();
}

interface Run extends Walk {
    public ArrayList move();
}

class Leopard {
    public Integer /*or ArrayList*/ move() { // X
        return null;
    }
}

public class Panther implements Run {
    public ArrayList move() { // Z
        return null;
    }
}
