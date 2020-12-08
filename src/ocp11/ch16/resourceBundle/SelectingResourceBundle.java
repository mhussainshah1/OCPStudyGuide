package ocp11.ch16.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class SelectingResourceBundle {
    public static void main(String[] args) {
        //Selecting Resource Bundle values
        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("ocp11.ch16.Zoo", locale);
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.println(rb.getString("visitors"));
//        System.out.println(rb.getString("close"));
        System.out.println(Locale.getDefault());
        System.out.println(rb.getLocale());
    }
}
