package ocp8.ch02.designPattern.factoryPattern;

public class Hay extends Food {

    Hay(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten: " + getQuantity());
    }
}
