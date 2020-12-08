package ocp8.ch03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List names = new ArrayList();//Java 4 and Prior
        List<String> names1 = new ArrayList<String>();//Java 5
        List<String> names2 = new ArrayList<>(); //Java 7
        var names3 = new ArrayList<String>();//Java 11
        
        HashMap<String, HashMap<String, String>> map1 = new HashMap<String, HashMap<String, String>>();//Java 5
        HashMap<String, HashMap<String, String>> map2 = new HashMap<>();//Java 7
        var map3 = new HashMap<String, HashMap<String, String>>(); //Java 11
    }
}