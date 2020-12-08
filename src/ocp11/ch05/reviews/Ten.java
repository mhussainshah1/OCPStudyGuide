package ocp11.ch05.reviews;

public class Ten {
    public static void main(String[] args) {
        var letters = new StringBuilder("abcdefg");
        letters.substring(1, 2); //returns a single character String.
        //letters.substring(2, 2); //returns a single character String.
        //letters.substring(6, 5); //returns a single character String.
        //letters.substring(6, 6); //returns a single character String.
        //letters.substring(1, 2); //throws an exception.
       // letters.substring(2, 2); //throws an exception.
        letters.substring(6, 5); //throws an exception.
       // letters.substring(6, 6); //throws an exception.
    }
}
