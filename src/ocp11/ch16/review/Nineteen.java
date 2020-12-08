package ocp11.ch16.review;

import java.util.Locale;
import java.util.ResourceBundle;

public class Nineteen {

    public static void main(String[] args) {
        var fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("ocp11.ch16.Dolphins", fr);
        System.out.println(b.getString("name"));//Dolly
        System.out.println(b.getString("age"));//0
    }
}