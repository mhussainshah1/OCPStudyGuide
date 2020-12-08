package ocp11.ch07.review;

//	24. Which of the following will compile when inserted in the following code? (Choose
//	all that apply)
public class Order3 {

    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";

    {
        // CODE SNIPPET 1
        value2 = "e";
        value3 = "f";
    }

    static {
        // CODE SNIPPET 2
        value2 = "h";
    }
}
