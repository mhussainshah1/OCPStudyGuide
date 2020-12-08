/**
 * 6. A var is not permitted in a multiple-variable declaration.
 */
package ocp11.ch02.var;

public class Rule6MultipleDeclaration {
    public void twoTypes() {
        int a, var b = 3; // DOES NOT COMPILE
        var a = 2,b = 3; // DOES NOT COMPILE
    }
}