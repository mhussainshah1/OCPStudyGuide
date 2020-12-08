package ocp11.ch07;

public class AccessModifier {

    public/*access modifier*/ final /*optional specifier*/ void /*return type*/
            nap/*method name*/(/*parentheses (required)*/int minutes/*list of parameters*/)
            throws InterruptedException /*exception (optional)*/ {
        // take a nap
        //method body
    }

    public void walk1() {
    }

    default void walk2() {
    } // DOES NOT COMPILE    

    void public walk3() {
    } // DOES NOT COMPILE

    void walk4() {
    }
}
