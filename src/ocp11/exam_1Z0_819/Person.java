package ocp11.exam_1Z0_819;
//c
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Tester {

    public static void main(String[] args) {
        Person p = new Person("Joe");
        checkPerson(p);
        System.out.println(p);
        p = null;
        checkPerson(p);
        System.out.println(p);
    }

    public static Person checkPerson(Person p) {
        if (p == null) {
            p = new Person("Mary");
        } else {
            p = null;
        }
        return p;
    }
}
