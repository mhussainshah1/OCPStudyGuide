package ocp11.exam_1Z0_819;
//D
class Thing {
    int x, y, z;
    public Thing() {
        System.out.println(x + "," + y + "," + z);
    }
    public Thing(int x) {
        this(x, 1);
        System.out.println(x + "," + y + "," + z);
    }
    public Thing(int x, int y) {
        this();
        System.out.println(x + "," + y + "," + z);
    }
}

public class Tester1 {
    public static void main(String[] args) {
        Thing t1 = new Thing(2);
    }
}
