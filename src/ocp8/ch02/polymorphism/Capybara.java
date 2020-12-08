package ocp8.ch02.polymorphism;

class Rodent {
}

public class Capybara extends Rodent {

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        /**
         * Rule -4
         * Even when the code compiles without issue, an exception may be thrown 
         * at runtime if the object being cast is not actually an instance of 
         * that class.
         */
        Capybara capybara = (Capybara) rodent;//Throws ClassCastException at runtime
        
        /**
         * use the instanceof operator prior to casting the object to avoid 
         * throwing ClassCastException at runtime
         */
        if (rodent instanceof Capybara) {
            Capybara capybara1 = (Capybara) rodent;
        }
    }
}
