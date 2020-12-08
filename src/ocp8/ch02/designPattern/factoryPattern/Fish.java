package ocp8.ch02.designPattern.factoryPattern;

public class Fish extends Food {

    Fish(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Fish eaten: " + getQuantity());
    }
}
