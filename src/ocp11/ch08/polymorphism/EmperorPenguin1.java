package ocp11.ch08.polymorphism;

class Penguin1 {

    public int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.print(this.getHeight());
    }
}

public class EmperorPenguin1 extends Penguin1 {

    public int getHeight() {
        return 8;
    }
    
    public void printInfo() {
        System.out.print(super.getHeight());
    }

    public static void main(String[] fish) {
        new EmperorPenguin1().printInfo();
    }
}
