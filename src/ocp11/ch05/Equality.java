package ocp11.ch05;

public class Equality {

    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one.equals(two));//false
        System.out.println(one == three); // true

        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x.equals(z)); // true

        String string = "a";
        StringBuilder builder = new StringBuilder("a");
        System.out.println(string == builder); //DOES NOT COMPILE
    }
}