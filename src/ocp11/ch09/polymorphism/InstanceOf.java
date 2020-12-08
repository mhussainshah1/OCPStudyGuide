package ocp11.ch09.polymorphism;

import java.io.Serializable;
import java.util.List;

public class InstanceOf {

    public static void main(String[] args) {
        Number tickets = 4;
        //unrelated class types
        if (tickets instanceof String) {} // DOES NOT COMPILE

        //class vs interface
        if (tickets instanceof List) {}
        
        Serializable ticket_s = 4;
        //interface vs interface
        if (ticket_s instanceof List) {}

        Integer ticket = 6;
        //final class vs interface
        if (ticket instanceof List) {} // DOES NOT COMPILE
    }
}