package ocp11.exam_1Z0_819;
//B
//E

@Functionallnterface
interface InterfaceD {

    int breed(int x);
}

interface InterfaceA {

    int GERM = 13;

    public default int getGERM() {
        return GERM;
    }
}

@FunctionalInterface
interface InterfaceC {

    public boolean equals(Object 

    0);
    int breed(int x);

    int calculate(int x, int y);
}

@FunctionalInterface
interface InterfaceE {

    public boolean equals(int i);

    int breed(int x);
}

@FunctionalInterface
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
}
