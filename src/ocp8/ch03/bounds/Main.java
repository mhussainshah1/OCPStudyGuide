package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;

interface Flyer {
    void fly();
}

class HangGlider implements Flyer {
    public void fly() {
    }
}

class Goose implements Flyer {
    public void fly() {
    }
}

public class Main {
    private void anyFlyer(List<Flyer> flyer) {
    }
    private void groupOfFlyers(List<? extends Flyer> flyer) {
    }
    public static void main(String[] args) {
        Main userFlyer = new Main();
        
        List<Flyer> flyers = new ArrayList<>();
        userFlyer.anyFlyer(flyers);
        userFlyer.groupOfFlyers(flyers);
        
        List<Goose> geese = new ArrayList<>();        
        userFlyer.anyFlyer(geese);
        userFlyer.groupOfFlyers(geese);       
    }
}