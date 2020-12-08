package ocp11.ch07;

public class Return {

    public void walk1() {
    }

    public void walk2() {
        return;
    }

    public String walk3() {
        return "";
    }

    public String walk4() {
    } // DOES NOT COMPILE

    public walk5() {
    } // DOES NOT COMPILE

    String walk6(int a) {
        if (a == 4) {
            return "";
        }
    }
    // DOES NOT COMPILE: return type in missing. It doesnt return when condition is false 

    int integer() {
        return 9;
    }

    int longMethod() {
        return 9L; // DOES NOT COMPILE
    }

    int integerExpanded() {
        int temp = 9;
        return temp;
    }

    int longExpanded() {
        int temp = 9L; // DOES NOT COMPILE
        return temp;
    }
}
