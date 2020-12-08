package ocp11.ch08.polymorphism;

import java.io.IOException;

public class Parent {
    public int a = 1;
    public int overloadedMethod(){
        System.out.println("Parent overloaded Method");
        return 0;
    }
    
    public int overridedMethod() throws IOException{
        System.out.println("Parent Overrided Method");
        return 0;
    }
    
    public static void hiddenMethod(){
        System.out.println("Parent static method");
    }
    
    private int redeclaredMethod(){
        System.out.println("Parent private Method");
        return 0;
    }
}
