package ocp11.ch10.review;

public class Two {

    public void ohNo(ArithmeticException ae) throws Exception {
        if (ae == null) {
            throw new Exception();
        } else {
            throw ae;
        }
    }
}