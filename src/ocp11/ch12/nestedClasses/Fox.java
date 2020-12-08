package ocp11.ch12.nestedClasses;

public class Fox {

    private class Den {
    }

    public void goHome() {
        new Den();
    }

    public static void visitFriend() {
        new Den();  // DOES NOT COMPILE
        //new Fox().new Den();
    }
}

class Squirrel {

    public void visitFox() {
        new Den();  // DOES NOT COMPILE
        new Fox().new Den();
    }
}
