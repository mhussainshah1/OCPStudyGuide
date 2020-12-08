package ocp11.ch08.constructor;

public class MouseHouse {

    private final int volume;
    private final String name = "The Mouse House";

    {
        volume = 10;
    }
}

class MouseHouse1 {

    private final int volume;
    private final String type;

    public MouseHouse1() {
        this.volume = 10;
        type = "happy";
    }
}

class MouseHouse3 {

    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse3(String type) {
        this.type = type;
    }

    public MouseHouse3() { // DOES NOT COMPILE
        this(null);
//        this.volume = 2; // DOES NOT COMPILE
    }
    
    public static void main(String[] args) {
        MouseHouse3 mh = new MouseHouse3();
        System.out.println(mh.volume + " " + mh.type);
    }
}
