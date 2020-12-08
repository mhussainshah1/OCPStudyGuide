package ocp11.ch07;

public class PassByValue {

    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.println(num); // 4

        String name = "  Webby ";
        speak(name);
        System.out.println(name);

        StringBuilder name1 = new StringBuilder("  Webby");
        speak1(name1);
        System.out.println(name1); // Webby
    }

    public static void newNumber(int num) {
        num = 8;
    }

    public static void speak(String name) {
        name = "Sparky";
    }

    public static void speak1(StringBuilder s) {
//        s = new StringBuilder("Method");
        s.append("Sparky");
    }
}
