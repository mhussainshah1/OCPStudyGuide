package ocp11.ch12.finalModifier;

abstract class Animal {
   abstract void chew();
}
 
class Hippo extends Animal {
   @Override
   final void chew() {}
}
 
class PygmyHippo extends Hippo {
   @Override
   void chew() {}  // DOES NOT COMPILE
}

abstract class ZooKeeper {
   public abstract final void openZoo();  // DOES NOT COMPILE
}