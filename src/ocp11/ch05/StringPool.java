package ocp11.ch05;

public class StringPool {

    public static void main(String[] args) {
        String x = "Hello World"; //String literal goes into String Pool at compile time
        String y = "Hello World";
        System.out.println(x == y); // true

        x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z); // false

        String singleString = "hello world";
        String oneLine = "hello" + " world";
        String concat = "hello ";
        concat += "world";
        System.out.println(singleString == oneLine); //true
        System.out.println(singleString == concat); //false

        x = "Hello World";
        y = new String("Hello World");
        System.out.println(x == y); // false

        String name = "Hello World";
        String name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true

        String first = "rat" + 1;
        String second = "r" + "a" + "t" + "1";
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);            //true
        System.out.println(first == second.intern());   //true
        System.out.println(first == third);             //false
        System.out.println(first == third.intern());    //true
    }
}
