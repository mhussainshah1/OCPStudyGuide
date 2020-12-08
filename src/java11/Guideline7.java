package java11;

public class Guideline7 {

    public static void main(String[] args) {
        //No issue 
        var ready = true; //boolean
        var ch = '\ufffd';//char
        var sum = 0L;//long
        var label = "wombat";//String

        //Whole number may be inferred as integer
        /* 
        byte flags = 0;
        short mask = 0x7fff;
        long base = 17;
         */
        var flags = 0; //int
        var mask = 0x7fff;//int
        var base = 17;//int

        //
        var f1 = 1.0f;
        var d3 = 3.0;
        var d4 = 4.0f; //float

    }
}
