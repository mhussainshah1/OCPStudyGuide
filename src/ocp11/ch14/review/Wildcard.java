package ocp11.ch14.review;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Wildcard {

    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Wildcard card = new Wildcard();
//        List<?> list1 = new ArrayDeque<String>();
        ArrayList<? super Date> list2 = new ArrayList<Date>();
//        List<?> list3 = new ArrayList<?>();
//        List<Exception> list4 = new LinkedList<java.io.IOException>();
        ArrayList<? extends Number> list5 = new ArrayList<Integer>();
        card.showSize(list2);
    }
}
