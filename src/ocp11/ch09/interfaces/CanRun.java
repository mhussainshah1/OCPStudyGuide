package ocp11.ch09.interfaces;

public interface CanRun {
}

class Cheetah extends CanRun {
} // DOES NOT COMPILE

class Hyena {
}

interface HasFur extends Hyena {
} // DOES NOT COMPILE
