package ocp11.ch14.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10) + " " + queue); // true
        System.out.println(queue.offer(4) + " " + queue); // true
        System.out.println(queue.peek() + " " + queue); // 10
        System.out.println(queue.poll() + " " + queue); // 10
        System.out.println(queue.poll() + " " + queue); // 4
        System.out.println(queue.peek() + " " + queue); // null

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek() + " " + stack); // 4
        System.out.println(stack.pop() + " " + stack); // 4
        System.out.println(stack.pop() + " " + stack); // 10
        System.out.println(stack.peek() + " " + stack); // null
    }
}
