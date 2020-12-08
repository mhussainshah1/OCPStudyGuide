package ocp11.ch16.resourceBundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyResourceBundle {
    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("ocp11.ch16.Zoo", locale);
        System.out.println(rb.getString("hello") + ", " + rb.getString("open"));
    }

    public static void main(String[] args) {
        //Creating Resource Bundle
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA");
        Locale frenchCanada = new Locale("fr", "CA");

        printWelcomeMessage(us); // Hello, is open
        printWelcomeMessage(france); // Bonjour, Le zoo est ouvert

        us = new Locale("en", "US");
        ResourceBundle rb1 = ResourceBundle.getBundle("ocp11.ch16.Zoo", us);
        rb1.keySet().stream()
                .map(k -> k + ": " + rb1.getString(k))
                .forEach(System.out::println);

        //Selecting Resource Bundle
        Locale.setDefault(new Locale("hi"));
        ResourceBundle rb = ResourceBundle.getBundle("ocp11.ch16.Zoo", new Locale("en"));        

        //Formatting Message
        rb = ResourceBundle.getBundle("ocp11.ch16.Zoo", us);
        String format = rb.getString("helloByName");
        System.out.print(MessageFormat.format(format, "Tammy", "Henry"));
    }
}
