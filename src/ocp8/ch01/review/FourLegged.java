package ocp8.ch01.review;

public class FourLegged {

    String walk = "walk,";

    static class BabyRhino extends FourLegged {

        String walk = "toddle,";
    }

    public static void main(String[] args) {
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        System.out.print(f.walk);
        System.out.println(b.walk);
    }
}
