package ocp11.ch14.review;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Nineteen {

    public static void main(String[] args) {
        List<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);//remove element at index
        System.out.print(q);

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(12);
        q1.remove(1);//remove object - it autobox primitive into wrapper class 
        System.out.print(q1);
    }
}
