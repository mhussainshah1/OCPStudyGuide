
package ocp11.ch08.constructor;


public class Singleton {

    private Singleton() {
    }
    
    class InnerClass extends Singleton{
        InnerClass(){
            super();
        }
    }

}