/*
 * 2. A var cannot be used in constructor parameters, method parameters, 
 * instance variables, or class variables.
 */

package ocp11.ch02.var;

public class Rule2Parameter {

    var tricky = "Hello"; // DOES NOT COMPILE
    static var a ="hi";
    
    public Rule2Parameter(var a){// DOES NOT COMPILE
        
    }
    public int addition(var a, var b) { // DOES NOT COMPILE
        return a + b;
    }
}
