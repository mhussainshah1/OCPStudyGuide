package ocp11.ch16.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class PickingResourceBundle {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));//default
        Locale locale = new Locale("fr", "FR");//requested
        var rb = ResourceBundle.getBundle("ocp11.ch16.Zoo", locale);
        System.out.println(rb.getString("name"));
    }
}
