package ocp8.ch03.genericInterfaces;

import java.awt.Robot;

public interface Shippable<T> {
    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot> {
    @Override
    public void ship(Robot t) {
    }
}

class ShippableAbstractCrate<U> implements Shippable<U> {
    @Override
    public void ship(U t) {
    }
}

class ShippableCrate implements Shippable {
    @Override
    public void ship(Object t) {
    }
}
