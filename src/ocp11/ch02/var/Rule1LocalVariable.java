/**
 * 1. A var is used as a local variable in a constructor, method, or initializer block.
 */
package ocp11.ch02.var;

public class Rule1LocalVariable {

    Rule1LocalVariable(){
        var name ="Constructor";
    }
    
    public void WhatTypeAmI() {
        var name = "Method";
        var size = 7;
    }
    
    {
        var name="initializer block";
    }
}
