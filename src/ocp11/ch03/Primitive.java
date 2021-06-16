package ocp11.ch03;

public class Primitive {

    long primitive() {
        byte b = (byte) 1;
             b = (short) 1;
             b = 1; //int ( -128  to 127)
 
        
        short s = (byte) 1;
              s = (short) 1;
              s = 1; //int (-32768 to 32767)

        int i = (byte) 1;
            i = (short) 1;
            i = 1; // (-2^31)-1 to 2^31 
        
        long lo = (byte) 1;
        lo = (short) 1;
        lo = 1;
        lo = 1L;
        
        float f = (byte) 1;
              f = (short) 1;
              f = 1;
              f = 3.14f;
        
        double d = (byte) 1;
               d = (short) 1;
               d = 1;
               d = 1L;
               d = 3.14f;
               d = 3.14; //double        
        
        char c = (byte) 1;
             c = (short) 1;
             c = 1;

        return 1;
    }

    Long Wrapper() {
        Byte b = (byte) 1;
             b = (short) 1;
             b = 1; //int
        
        Short s = (byte) 1;
              s = (short) 1;
              s = 1;
        
        Integer i = 1;
        Long a = 1L;
        Double d = 3.14;
        Float f = 3.14f;
        
        Character c = (byte) 1;
                  c = (short) 1;
                  c = 1;

        return 1L;
    }

    public static void main(String[] args) {

    }
}
