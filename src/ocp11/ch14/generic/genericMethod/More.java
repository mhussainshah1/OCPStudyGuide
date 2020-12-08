package ocp11.ch14.generic.genericMethod;

public class More {

    public static <T> void sink(T t) {}

    public static <T> T identity(T t) {return t;}

    public static T noGood(T t) {return t;} // DOES NOT COMPILE
    
    public T instancemethod(T t){return t;}
}

class Test<T>{
    
    public T instancemethod(T t){return t;}
    
    public static T staticMethod(T t) {return t;} // DOES NOT COMPILE
}
