package ocp11.ch15.exam;

@FunctionalInterface
interface InterfaceB {
    int breed(int x);
}

interface InterfaceA {
    int GERM = 13;
    public default int getGBRM() {
        return GERM;
    }
}
/*
@FunctionalInterface
interface InterfaceC {
    public boolean equals(Object o);
    int breed(int x);
    int calculate(int x, int y);
}
*/
/*
@FunctionalInterface
interface InterfaceE {
    public boolean equals(int i);
    int breed(int X);
}
*/

/*
interface InterfaceB {
    int GERM = 13;

    public default int getGERM() {
        return get();
    }

    private int get() {
        return GERM;
    }

    public boolean equals(Object o);
    int breed(int x);
}*/
