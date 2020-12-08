package ocp11.ch05.reviews;

import java.util.ArrayList;

public class Sixteen {

    public static void main(String[] args) {
       
        //Array
        int a[] = {1, 2},
                b[] = {1, 2};

        System.out.println(a.equals(b));//false
        System.out.println(a == b);

        //ArrayList
        ArrayList l1 = new ArrayList<>(),
                l2 = new ArrayList<>();
//        l1.remove(0); //It will compile but gives runtime error.
        l1.add(1);
        l1.add(2);

        l2.add(1);
        l2.add(2);

        System.out.println(l1.equals(l2));//true
        System.out.println(l1 == l2);//false
    }
}
