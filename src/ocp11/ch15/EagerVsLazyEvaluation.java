package ocp11.ch15;

import java.util.function.Supplier;
//https://blog.rapid7.com/2017/01/13/java-8-lazy-argument-evaluation/
public class EagerVsLazyEvaluation {

    static boolean compute(String str) {
        System.out.println("executing...");
        // expensive computation here
        return str.contains("a");
    }

    static String eagerMatch(boolean b1, boolean b2) {
        return b1 && b2 ? "match" : "incompatible!";
    }

    static String lazyMatch(Supplier<Boolean> a, Supplier<Boolean> b) {
        return a.get() && b.get() ? "match" : "incompatible!";
        //call function here - if first part returns false then other doesn`t execute
    }

    public static void main(String[] args) {
        System.out.println(eagerMatch(compute("bb"), compute("aa")));//call function
        
        System.out.println(lazyMatch(() -> compute("bb"), () -> compute("aa")));
    }

}
