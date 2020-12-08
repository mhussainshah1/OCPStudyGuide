package ocp11.ch07.review;

//5. Given the following method, which of the method calls return 2? (Choose all that apply)
public class Five {

    public static int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) {
        //howMany();
        System.out.println(howMany(true));
        System.out.println(howMany(true, true));
        System.out.println(howMany(true, true, true));
        //howMany(true, {true});
        //howMany(true, {true, true});
        System.out.println(howMany(true, new boolean[2]));
    }
}
