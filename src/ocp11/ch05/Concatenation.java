package ocp11.ch05;

public class Concatenation {

    public static void main(String[] args) {
        String name1 = "Fluffy";
        String name2 = new String("Fluffy");

        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3 + 1); // ab31
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2);//c12

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);//64

        String s = "1"; // s currently holds "1"
        s += "2"; // s currently holds "12"
        s += 3; // s currently holds "123"
        System.out.println(s); // 123
    }
}
