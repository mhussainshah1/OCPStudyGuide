package ocp8.ch03.legacyCode;

import java.util.ArrayList;
import java.util.List;

public class LegacyAutoboxing {

    public static void main(String[] args) {
       List numbers = new ArrayList();
        numbers.add(5);
        int result = (int)numbers.get(0); // DOES NOT COMPILE
    }
}
