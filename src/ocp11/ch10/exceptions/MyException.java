package ocp11.ch10.exceptions;

public class MyException {

    public static void main(String[] args) {
        String[] names = {"Amir", "Hussain", "Shah"};
        MyException me = new MyException();
        System.out.println(me.indexOf(names, "Muhammad"));
        
        
        String[] animals = new String[0];
        System.out.println(animals[0]);
    }
    
    //Return Codes
    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
