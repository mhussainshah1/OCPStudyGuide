package ocp11.ch12.interfaceMembers;

public interface Carnivore {

    public default void eatMeat();        // DOES NOT COMPILE

    public int getRequiredFoodAmount() {  // DOES NOT COMPILE
        return 13;
    }
}
