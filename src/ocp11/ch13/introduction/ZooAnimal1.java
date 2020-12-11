package ocp11.ch13.introduction;

import ocp11.ch13.introduction.Lion;

@interface ZooAnimal1 {
    String habitat();
}

class Veterinarian {

    @ZooAnimal1(habitat = "Infirmary")
    private Lion sickLion;

    @ZooAnimal1(habitat = "Safari")
    private Lion healthyLion;

    @ZooAnimal1(habitat = "Special Enclosure")
    private Lion blindLion;
    
}
