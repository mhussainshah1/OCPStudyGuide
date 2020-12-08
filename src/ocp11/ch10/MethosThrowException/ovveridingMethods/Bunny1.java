package ocp11.ch10.MethosThrowException.ovveridingMethods;

class CanNotHopException1 extends Exception {
}

class Hopper1 {

    public void hop() throws CanNotHopException1 {
    }
}

class Bunny1 extends Hopper1 {

    public void hop() {
    }
}
