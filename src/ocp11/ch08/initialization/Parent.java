package ocp11.ch08.initialization;
//AFBDEGH
public class Parent {
    static String s = "A";
    static {System.out.print(s);}//1

    String instance = "B";
    {System.out.print(instance);}//3

    Parent() { System.out.print("C");}
    
    Parent(int i) {System.out.print("D");}//4
    
    Parent(String s) {
        this(1);
        System.out.print("E");//5
    }
}

class Child extends Parent {
    static String s = "F";
    static {System.out.print(s);}//2

    String instance = "G";
    {System.out.print(instance);}//6

    Child(int i) {
        super("call");
        System.out.println("H");//7
    }
    
    public static void main(String[] args) {
        new Child(1);
        new Child(2);
    }
}