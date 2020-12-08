package ocp11.ch09.interfaces;

public interface Sing {

    /*public static final*/ float volume = 10;

    /*public*/ abstract void start();
}

class Test implements Sing{

    @Override
    public void start() {
//        volume = 4;
        
    }
    
}
