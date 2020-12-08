package ocp11.ch08.review;

class Person {
    static String name;
    void setName(String q) {
        name = q;
    }
}

public class Child1 extends Person {
    static String name;
    @Override
    void setName(String w) {
        name = w;
    }

    public static void main(String[] p) {
        final Child1 m = new Child1();
        final Person t = m;        
//         m = new Child1();
        m.name = "Elysia";
        t.name = "Sophia";
        m.setName("Webby");
        t.setName("Olivia");
        System.out.println(m.name + " " + t.name);
    }
}