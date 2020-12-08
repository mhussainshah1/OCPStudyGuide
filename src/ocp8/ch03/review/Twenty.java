package ocp8.ch03.review;

import java.util.HashMap;
import java.util.Map;

public class Twenty {

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(m.contains("123"));
        System.out.println(m.containsKey("123")); //false
    }
}
