package ocp11.ch14.methodReferemce;

import java.util.function.*;

public class MyClass {

    //1
    MyClass() {}
    MyClass(int a) {}

    //2
    public static void staticMethod() {}
    public static void staticMethod(int a) {}

    //3
    public void instanceMethod() {}
    public void instanceMethod(int a) {}
    public void instanceMethod(int a, int b) {}

    public static void main(String[] args) {

        //1 constructor
                 Supplier<MyClass> r11 = MyClass::new; // () -> new MyClass();        
        Function<Integer, MyClass> r12 = MyClass::new; //(a) -> new MyClass(a);

        //2 static method
                 Runnable r21 = MyClass::staticMethod;// () -> staticMethod();        
        Consumer<Integer> r22 = MyClass::staticMethod;//(a) -> staticMethod(a);
        
        //3 instance method on particular object
        var obj = new MyClass();
                            Runnable r31 = obj::instanceMethod;//   () -> obj.instanceMethod();        
                   Consumer<Integer> r32 = obj::instanceMethod;//    a -> obj.instanceMethod(a);
        BiConsumer<Integer, Integer> r33 = obj::instanceMethod;//(a,b) -> obj.instanceMethod(a,b);

        //4 instace method on parameter - use first parameter as instance
                   Consumer<MyClass> r41 = MyClass::instanceMethod;//     c -> c.instanceMethod();
        BiConsumer<MyClass, Integer> r42 = MyClass::instanceMethod;//(c, a) -> c.instanceMethod(a);

    }
}
