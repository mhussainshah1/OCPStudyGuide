package ocp11.ch10.MethosThrowException.ovveridingMethods;

class Hopper3 {

    public void hop() {
    }
}

class Bunny3 extends Hopper3 {

    public void hop() throws IllegalStateException {
    }
}
