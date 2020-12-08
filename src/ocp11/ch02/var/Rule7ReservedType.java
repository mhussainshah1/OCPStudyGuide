/**
 *7. A var is a reserved type name but not a reserved word, meaning it can be 
 * used as an identifier except as a class, interface, or enum name.
 */

package ocp11.ch02.var;

public class Rule7ReservedType {

}

class Var {

    public Var(){
        
    }
    public void var() {
        var var = "var";
    }

    public void Var() {
        Var var = new Var();
    }
}

class var { // DOES NOT COMPILE
    public var() {
    }
}
interface var{
    
}
enum var{
    
}