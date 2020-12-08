package ocp11.ch08.polymorphism;

public class Main {

    public static void main(String[] args) throws Exception{
        Parent p = new Parent();
        System.out.println(p.a);
        p.overloadedMethod();
        p.overridedMethod();
        p.hiddenMethod();
//        p.redeclaredMethod();

        p = new Child();
        System.out.println(p.a);
        p.overloadedMethod();        
        p.overridedMethod();//child
        p.hiddenMethod();
//        p.redeclaredMethod();

        Child c = new Child();
        System.out.println(c.a);
        c.overloadedMethod();//parent
        c.overloadedMethod(1);
        c.overridedMethod();
        c.hiddenMethod();
    }
}
