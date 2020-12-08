package ocp11.ch10.HandlingException;

class AnimalsOutForAWalk extends RuntimeException {}
class ExhibitClosed extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitClosed {}

public class MultipleException {

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today");
        }
    }

    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {// subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// superclass exception
            System.out.print("not today");
        }

        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        } catch (ExhibitClosedForLunch e) {// DOES NOT COMPILE
            System.out.print("try back later");
        }
    }

    public void visitSnakes() {
        try {
        } catch (IllegalArgumentException e) {
        } catch (NumberFormatException e) { // DOES NOT COMPILE
        }
    }

    public void visitManatees() {
        try {
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IllegalArgumentException e2) {
            System.out.println(e1); // DOES NOT COMPILE
        }
    }

    private void seeAnimal() {
        throw new ExhibitClosed();
    }
}
