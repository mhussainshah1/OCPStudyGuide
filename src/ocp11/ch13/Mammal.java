package ocp11.ch13;

@interface ZooAnimal {
}

public class Mammal {}

class Bird {}

@ZooAnimal
class Lion extends Mammal {}

@ZooAnimal
class Peacock extends Bird {}
