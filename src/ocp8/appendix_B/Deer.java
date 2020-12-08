package ocp8.appendix_B;

public class Deer {

    //attributes
    private int age;
    private String name;

    //constructor
    public Deer(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    //getter and setter methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
