package ocp11.ch10.HandlingException;

public class ThrowException {

    public static void main(String[] args) {
//        try // DOES NOT COMPILE        
//            fall();
//        catch (Exception e) 
//            System.out.println("get up");        

//        try {// DOES NOT COMPILE
//            fall();
//        }
    }

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    void explore(int a) {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        goHome();
    }

    void fall() {
        throw new RuntimeException();
    }

    private void getUp() {}

    private void seeAnimals() {}

    private void getHugFromDaddy() {}

    private void seeMoreAnimals() {}

    private void goHome() {}
}
