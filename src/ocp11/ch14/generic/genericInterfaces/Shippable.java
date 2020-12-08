package ocp11.ch14.generic.genericInterfaces;

import java.awt.Robot;

public interface Shippable<T> {
    void ship(T t);
}
//1
class ShippableRobotCrate implements Shippable<Robot> {
    @Override
    public void ship(Robot t) {
    }
}
//2
class ShippableAbstractCrate<U> implements Shippable<U> {
    @Override
    public void ship(U t) {
    }
}
//3
class ShippableCrate implements Shippable {
    @Override
    public void ship(Object t) {
    }
}
