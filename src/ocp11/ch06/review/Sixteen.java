package ocp11.ch06.review;

public class Sixteen {

    public void isIt(String param1, final String param2) {
        final String local1 = param1 + param2;
        String local2 = param1 + param2;
        
        param1 = null;
        local2 = null;
    }
}