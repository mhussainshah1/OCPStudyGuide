package ocp11.ch08;

class Animal {

    private int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}

public class Lion extends Animal {

    public void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }

    public void roar() {
//        System.out.print("Lions age: "+age); // DOES NOT COMPILE
        System.out.print(name + ", age " + getAge() + ", says: Roar!");
    }

    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }
}
