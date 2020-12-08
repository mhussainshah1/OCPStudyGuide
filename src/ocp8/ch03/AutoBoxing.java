package ocp8.ch03;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

    public static void main(String[] args) {
        boolean bool = new Boolean(true);
        byte by = new Byte((byte) 1);
        short sh = new Short((short) 1);
        int i = new Integer(1);
        long l = new Long(1);
        float fl = new Float(1.0);
        double db = new Double(1.0);
        char c = new Character('c');

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);
    }
}