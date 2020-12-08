package ocp11.ch08.inheritance;

class Camel {

    public int getNumberOfHumps() {
        return 1;
    }
}

class BactrianCamel extends Camel {

    private int getNumberOfHumps() { // DOES NOT COMPILE
        return 2;
    }
}

public class Rider {

    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.print(c.getNumberOfHumps());
    }
}
