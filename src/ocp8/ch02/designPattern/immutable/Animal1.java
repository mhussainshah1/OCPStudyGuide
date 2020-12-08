package ocp8.ch02.designPattern.immutable;

import java.util.*;

public final class Animal1 {

    private final List<String> favoriteFoods;

    public Animal1(List<String> favoriteFoods) {
        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public List<String> getFavoriteFoods() { // THIS METHOD MAKES CLASS MUTABLE!
        return favoriteFoods;
    }
    
     @Override
    public String toString() {
        return "Animal{" + "favoriteFoods=" + favoriteFoods + '}';
    }

    public static void main(String[] args) {
        // Create a new Animal instance
        Animal1 lion = new Animal1( Arrays.asList("meat", "more meat"));
        System.out.println(lion);
        
        lion.getFavoriteFoods().clear();        
        System.out.println(lion);
    }
}
