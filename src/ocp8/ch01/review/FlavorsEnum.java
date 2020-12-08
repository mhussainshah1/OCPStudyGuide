package ocp8.ch01.review;

public class FlavorsEnum {

    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    public static void main(String[] args) {
        System.out.println(Flavors.CHOCOLATE.ordinal());
    }
}
