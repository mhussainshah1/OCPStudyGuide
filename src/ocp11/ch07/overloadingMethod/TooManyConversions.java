package ocp11.ch07.overloadingMethod;

public class TooManyConversions {    
    
    public static void play(Long l) {
        var v = "Amir";
        System.out.println(v);
    }

    public static void play(Long... l) {
    }
    
//    public static void play(Object o){
//        System.out.println(o.getClass());
//    }

    public static void main(String[] args) {
        play(4); // DOES NOT COMPILE. Complier can convert 4 into 4L or new Integer(4)
        play(new Integer(4));
        play(4L); // calls the Long version
    }
}
