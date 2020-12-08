package ocp11.ch08.polymorphism;

public class Child extends Parent{
    protected int a = 2;
    public void overloadedMethod(int i){
        System.out.println("Child overloaded Method");
    }
    
    @Override
    public int overridedMethod() throws RuntimeException{
        System.out.println("child overrided Method");
        return 0;
    }

    public static void hiddenMethod(){
        System.out.println("Child static Method");
    }
    
    private String redeclaredMethod(){
        System.out.println("Child private Method");
        return "child private method";
    }
}
