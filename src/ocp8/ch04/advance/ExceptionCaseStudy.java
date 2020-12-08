package ocp8.ch04.advance;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class ExceptionCaseStudy {

    public static void main(String[] args) throws IOException {
        ExceptionCaseStudy.create().stream().count();

//        Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE
        
        //Approach 1
        Supplier<List<String>> s = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
        //Approach 2
        Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
    }

    private static List<String> create() throws IOException {
        throw new IOException();
    }
    
    //wrapper method
    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
