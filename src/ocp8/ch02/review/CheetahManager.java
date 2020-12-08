package ocp8.ch02.review;

public class CheetahManager {

    public static CheetahManager cheetahManager;

    private CheetahManager() {
    }

    public static CheetahManager getCheetahManager() {
        if (cheetahManager == null) {
            cheetahManager = new CheetahManager();
        }
        return cheetahManager;
    }
}

//Singleton Class (lazy initialization)
class SingletonCheetahManager {

    //Change the access modifier of cheetahManager from public to private
    private static SingletonCheetahManager cheetahManager;

    private SingletonCheetahManager() {
    }

    //Add synchronized to getCheetahManager()
    public static synchronized SingletonCheetahManager getCheetahManager() {
        if (cheetahManager == null) {
            cheetahManager = new SingletonCheetahManager();
        }
        return cheetahManager;
    }
}
