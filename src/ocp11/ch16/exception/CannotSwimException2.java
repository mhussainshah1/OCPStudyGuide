package ocp11.ch16.exception;

public class CannotSwimException2 extends Exception {

    public CannotSwimException2() {
        super(); // Optional, compiler will insert automatically
    }

    public CannotSwimException2(Exception e) {
        super("Cannot swim because: " + e.toString());
    }

    public CannotSwimException2(String message) {
        super(message);
    }

    public static void main(String[] args) throws Exception {
//        try{
            throw new CannotSwimException2();
//        } catch(CannotSwimException2 e){
//            e.printStackTrace();
//        }        
    }
}
