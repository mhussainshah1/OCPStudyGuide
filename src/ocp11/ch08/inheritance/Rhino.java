package ocp11.ch08.inheritance;

public class Rhino {

    protected CharSequence getName() {
        return "rhino";
    }

    protected String getColor() {
        return "grey, black, or white";
    }
}

class JavanRhino extends Rhino {

    public String getName() {
        return "javan rhino";
    }

    public CharSequence getColor() { // DOES NOT COMPILE
        return "grey";
    }
}
