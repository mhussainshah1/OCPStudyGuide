
package ocp11.ch09.abstractclass;

public abstract class Turtle {
    public abstract long eat() // DOES NOT COMPILE
    public abstract void swim() {}; // DOES NOT COMPILE
    public abstract int getAge() { // DOES NOT COMPILE
        return 10;
    }
    public void sleep; // DOES NOT COMPILE
    public void goInShell(); // DOES NOT COMPILE
}