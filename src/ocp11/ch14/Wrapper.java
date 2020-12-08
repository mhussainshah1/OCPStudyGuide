package ocp11.ch14;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

    public static void main(String[] args) {
        boolean bool = Boolean.valueOf(true);
        byte b = Byte.valueOf((byte) 1);
        short s = Short.valueOf((short) 1);
        int i = Integer.valueOf(1);
        long l = Long.valueOf(1L);
        float f = Float.valueOf(1.0f);
        double d = Double.valueOf(1.0);
        char c = Character.valueOf('c');

        Integer pounds = 120;
        Character letter = "robot".charAt(0);
        char r = letter;
        
        var heights = new ArrayList<Integer>();
        heights.add(null);
//        int h = heights.get(0); // NullPointerException
        
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(Integer.valueOf(3));
        numbers.add(Integer.valueOf(5));
        numbers.remove(1);
        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers);//[1]
        
        
        numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(Integer.valueOf(3));
        numbers.add(Integer.valueOf(5));
        numbers.remove(Integer.valueOf(1));
        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers);//[3]
        
        
    }
}
