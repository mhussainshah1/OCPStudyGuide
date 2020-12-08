package ocp11.exam_1Z0_819;

import java.io.Serializable;

public class Q9 {
    class Classes implements Serializable{
        String id;
    }
    class Person{
        String name;
        transient String address;
    }
    class Student extends Person implements Serializable{
        String stdNo;
        Classes c = new Classes();
    }    
}
