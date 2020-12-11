package ocp11.ch13.introduction;
//Marker annotation
public @interface ZooAnimal {}

class Mammal {}

class Bird {}

@ZooAnimal
class Lion extends Mammal {}

@ZooAnimal
class Peacock extends Bird {}
