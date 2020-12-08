package ocp11.ch05;

public class Names {

    public static void main(String[] args) {
        String names[] = new String[2];

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        /*
        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        //  ArrayStoreException: 
        //  Runtime exception thrown when store wrong type of object into an 
        //  array of objects.
        objects[0] = new StringBuilder(); // careful!
        Object x[] = new String[3];
        x[0] = new Integer(0);
         */

        //Using an Array
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey

        String[] birds = new String[6];
        System.out.println(birds.length);

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
        }
        //ArrayIndexOutOfBoundsException
        numbers[10] = 3;
        numbers[numbers.length] = 5;
        for (int i = 0; i <= numbers.length; i++) {
            numbers[i] = i + 5;
        }
    }
}
