package ocp8.ch02.designPattern.factoryPattern;

public abstract class Food {

    private int quantity;

    Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void consumed();
}
