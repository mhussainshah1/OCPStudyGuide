package ocp11.ch14.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

interface Flyer {
    void fly();
}

class HangGlider implements Flyer {
    @Override public void fly() {}
}

class Goose implements Flyer {
    @Override public void fly() {}
}

public class Flying {
    private void anyFlyer(List<Flyer> flyer) {}
    
    private void groupOfFlyers(List<? extends Flyer> flyer) {}

    public static void main(String[] args) {
        Flying userFlyer = new Flying();

        List<Flyer> flyers = new ArrayList<>();
        userFlyer.anyFlyer(flyers);
        userFlyer.groupOfFlyers(flyers);

        List<Goose> geese = new ArrayList<>();
        userFlyer.anyFlyer(geese);
        userFlyer.groupOfFlyers(geese);
    }
}
