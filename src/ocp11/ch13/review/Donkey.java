package ocp11.ch13.review;

import java.util.*;

public class Donkey {

    @SuppressWarnings("unchecked")
    public String kick(List... t) {
        t[0] = new ArrayList();
        t[0].add(1);
        return (String) t[0].get(0);
    }
}
