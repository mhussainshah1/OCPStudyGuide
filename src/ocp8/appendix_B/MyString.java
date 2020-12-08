package ocp8.appendix_B;

public class MyString {

    public static void main(String[] args) {
        String mammal = "DOLPHIN";
        String modified = mammal.substring(2, mammal.indexOf('I'));
        modified += "x" + mammal.substring(4);
        System.out.println(modified);
    }
}
