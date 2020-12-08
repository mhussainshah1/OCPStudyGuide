package ocp8.ch03.review;

import java.util.*;

public class Five {

    public static void main(String[] args) {
        HashSet<Number> hs = new HashSet<Integer>();
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        List<String> list = new Vector<String>();
        List<Object> values = new HashSet<Object>();
        List<Object> objects = new ArrayList<? extends Object>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
