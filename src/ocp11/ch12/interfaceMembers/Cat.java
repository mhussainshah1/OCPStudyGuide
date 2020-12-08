package ocp11.ch12.interfaceMembers;

interface Walk {

    public default int getSpeed() {
        return 5;
    }
}

interface Run {

    public default int getSpeed() {
        return 10;
    }
}

public class Cat implements Walk, Run {

    @Override
    public int getSpeed() {
        return 1;
    }
    
    public int getWalkSpeed(){
        return Walk.super.getSpeed();
    }

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
        System.out.println(new Cat().getWalkSpeed());
    }
}
