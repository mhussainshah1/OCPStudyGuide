package ocp11.ch07.overloadingMethod;

public class Glider {

    //Exact match by type 
    public static String glide(int i, int j) {
        return "1";
    }
    
    //Larger primitive type 
    public static String glide(long i, long j) {
        return "2";
    }

    //Autoboxed type 
    public static String glide(Integer i, Integer j) {
        return "3";
    }

    //Varargs 
    public static String glide(int... nums) {
        return "4";
    }
    
    public static void main(String[] args) {
        System.out.println(glide(1,1));
    }
}
