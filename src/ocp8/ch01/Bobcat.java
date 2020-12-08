package ocp8.ch01;

public class Bobcat {

    public void findDen() {
    }
}

class BobcatKitten extends Bobcat {

    @Override
    public void findDen() {
    } //override

    @Override
    public void findDen(boolean b) {
    } //overload

    public int findden() throws Exception {
        return 0;
    } //different method
}
