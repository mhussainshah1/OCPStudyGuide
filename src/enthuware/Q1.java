package enthuware;

public class Q1 {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;
        Double d = 1.0;

        System.out.println((i1 == i2) + "\n"
                + (i1 == i3));
//        System.out.println(i1 == b1);
        System.out.println(i1.equals(i2) + "\n"
                + i1.equals(g1) + "\n"
                + i1.equals(b1) + "\n"
                + (d > 1L));
    }
}
