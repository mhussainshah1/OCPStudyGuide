/*
 * 5. A var cannot be initialized with a null value without a type.
 */
package ocp11.ch02.var;

public class Rule5Null {

    public void var_and_null() {
        var n = null; // DOES NOT COMPILE

        var n = "myData";
        n = null;
        var m = 4;
        m = null; // DOES NOT COMPILE

        var o = (String) null;
    }
}