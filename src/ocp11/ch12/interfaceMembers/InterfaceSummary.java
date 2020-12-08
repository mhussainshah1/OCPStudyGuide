package ocp11.ch12.interfaceMembers;

public interface InterfaceSummary {

    int CONSTANT = 1; //public static final - by default

    int abstractMethod();//public abstract - by default

    default int defaultMethod() {
        abstractMethod();
        privateMethod();
        staticMethod();
        privateStaticMethod();
        return CONSTANT;
    }//public - by default   

    private int privateMethod() {
        defaultMethod();
        abstractMethod();
        staticMethod();
        privateStaticMethod();
        return CONSTANT;
    }

    static int staticMethod() {
        privateStaticMethod();
        return CONSTANT;
    }//public - by default

    private static int privateStaticMethod() {
        return CONSTANT;
    }
}

class WithInterface implements InterfaceSummary {

    public int abstractMethod() {
        return CONSTANT;
    }

    public int instaceMethod() {
        defaultMethod();
        InterfaceSummary.staticMethod();        
        return CONSTANT;
    }
}

class WithoutInterface {
    public int instaceMethod() {
        InterfaceSummary.staticMethod();
        return InterfaceSummary.CONSTANT;
    }
}