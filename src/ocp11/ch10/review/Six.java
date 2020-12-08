package ocp11.ch10.review;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Six {

    public void tryAgain(String s) {
        try (FileReader r = null ,/*; 
                var*/ p = new FileReader("")) {
                System.out.print("X");
                throw new IllegalArgumentException();
        }catch (Exception s1) {
        System.out.print("A");
        throw new FileNotFoundException();
        }finally {
        System.out.print("O");
        }
    }
}