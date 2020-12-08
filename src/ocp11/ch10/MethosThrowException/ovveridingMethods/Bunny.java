package ocp11.ch10.MethosThrowException.ovveridingMethods;

class CanNotHopException extends Exception {
}

class Hopper {

    public void hop() {
    }
}

class Bunny extends Hopper {

    public void hop() throws CanNotHopException {
    } // DOES NOT COMPILE
}
