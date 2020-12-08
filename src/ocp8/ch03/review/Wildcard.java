package ocp8.ch03.review;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Wildcard {

    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Wildcard card = new Wildcard();
        ArrayDeque<?> list1 = new ArrayDeque<String>();
        ArrayList<? super Date> list2 = new ArrayList<Date>();
//        List<?> list3 = new ArrayList<?>();
//        List<Exception> list4 = new LinkedList<java.io.IOException>();
        Vector<? extends Number> list5 = new Vector<Integer>();
        card.showSize(list2);
    }
}
