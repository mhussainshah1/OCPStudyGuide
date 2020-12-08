package ocp11.ch12.interfaceMembers;

interface Walk2 {

    public default int getSpeed() {
        return 5;
    }
}

interface Run2 {

    public default int getSpeed() {
        return 10;
    }
}

public abstract class Cat2 implements Walk2, Run2 {

    public int getSpeed() {
        return 1;
    }
    
    public abstract boolean makeSound();

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}

