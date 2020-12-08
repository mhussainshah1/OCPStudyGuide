package ocp11.ch15.advance;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class ExceptionCaseStudy {
    private static List<String> create() throws IOException {
        throw new IOException();
    }

    public void good() throws IOException {
        ExceptionCaseStudy.create().stream().count();
    }

    public void bad() throws IOException {
//        Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE
    }
    
    //Approach 1
    public void ugly() {
        Supplier<List<String>> s = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
    
    //Approach 2
    //wrapper method
    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void wrapped(){
        Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
    }
}
