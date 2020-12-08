package ocp11.ch05;

public class Mutable {

    private String s;

    public void setS(String newS) {
        s = newS;
    } // Setter makes it mutable

    public String getS() {
        return s;
    }

    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }
}

final class Immutable {

    final private String s = "name";

    public String getS() {
        return s;
    }
}
