/*
 * 4. The value of a var can change, but the type cannot.
 */
package ocp11.ch02.var;

public class Rule4Reassignment {

    public void reassignment() {
        var number = 7;
        number = 4;
        number = "five"; // DOES NOT COMPILE

        /**
         * int number = "five";
         */
        var apples = (short) 10;
        apples = (byte) 5;
        apples = 1_000_000; // DOES NOT COMPILE

        /**
         * short apples = (short)10; 
         * apples = (byte)5; 
         * apples = 1_000_000; //DOES NOT COMPILE
         */
    }
}
