// 9. Which are methods using JavaBeans naming conventions for accessors and mutators?
// (Choose all that apply)
package ocp11.ch07.review;

public class Nine {
    boolean canSwim;
    int numberWings;

    public int getNumberWings() {
        return numberWings;
    }
    
    public boolean getCanSwim() { return canSwim;}
    public boolean canSwim() { return numberWings;}
    public int getNumWings() { return numberWings;}
    public int numWings() { return numberWings;}
    public void setCanSwim(boolean b) { canSwim = b;}
}
