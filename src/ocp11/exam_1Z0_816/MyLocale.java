package ocp11.exam_1Z0_816;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocale {

    public static void main(String[] args) {
        Locale.setDefault(Locale.FRANCE);
        Locale currentLocale = new Locale.Builder()
                .setLanguage("en")
                .build();

        ResourceBundle messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
        System.out.println(messages.getString("message"));
    }
}
