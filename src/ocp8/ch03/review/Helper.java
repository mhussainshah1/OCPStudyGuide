package ocp8.ch03.review;

import java.io.FileNotFoundException;

public class Helper {

    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Helper.printException(new FileNotFoundException("A"));
        Helper.printException(new Exception("B"));
//        Helper.<Throwable>printException(new Exception("C"));
        Helper.<NullPointerException>printException(new NullPointerException("D"));
//        Helper.printException(new Throwable("E"));
    }
}
