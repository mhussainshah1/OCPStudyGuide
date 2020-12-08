package ocp11.ch16.review;

import java.util.Locale;
import java.util.ResourceBundle;

public class Six {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("ocp11.ch16.Dolphins");
        System.out.println(b.getString("name"));
    }
}
