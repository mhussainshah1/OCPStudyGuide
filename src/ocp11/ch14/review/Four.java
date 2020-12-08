package ocp11.ch14.review;

import java.util.LinkedList;

public class Four {

    public static void main(String[] args) {
        var greetings = new LinkedList<String>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null) {
            System.out.print(greetings.pop());
        }
    }
}
