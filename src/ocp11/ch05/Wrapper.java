package ocp11.ch05;

public class Wrapper {

    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        //int bad1 = Integer.parseInt("a"); // throws NumberFormatException
        //Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException
        //Boolean 
        boolean bp = Boolean.parseBoolean("true");
        Boolean bw = Boolean.valueOf("TRUE");

        //Byte 
        byte byp = Byte.parseByte("1");
        Byte byw = Byte.valueOf("2");

        //Short
        short sp = Short.parseShort("1");
        Short sw = Short.valueOf("2");

        //Integer 
        int ip = Integer.parseInt("1");
        Integer iw = Integer.valueOf("2");

        //Long 
        Long.parseLong("1");
        Long lw = Long.valueOf("2");

        //Float 
        float fp = Float.parseFloat("1");
        Float fw = Float.valueOf("2.2");

        //Double 
        Double.parseDouble("1");
        Double dw = Double.valueOf("2.2");
    }
}
