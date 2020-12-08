package ocp11.ch07;

class Koala {

    public static int count = 0; // static variable

    public static void main(String[] args) { // static method
        System.out.println(count++);//0
    }
}

public class KoalaTester {

    public static void main(String[] args) {
        System.out.println(Koala.count++);//0
        Koala.main(new String[0]); // call static method

        Koala k = new Koala();
        System.out.println(k.count++); // k is a Koala & value is 2
        k = null;
        System.out.println(k.count++); // k is still a Koala and value is 3

        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);//5
        System.out.println(koala1.count);//5
        System.out.println(koala2.count);//5
    }
}
