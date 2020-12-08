package ocp11.ch16.localization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MyLocal {

    public static void main(String[] args) throws ParseException {
        //Selecting a Locale
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        //Select a locale
        //1
        System.out.println(Locale.GERMAN); // de
        System.out.println(Locale.GERMANY); // de_DE

        //2
        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN
        System.out.println(new Locale("xx", "XX"));

        //3
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
        
        //set locale
        System.out.println(Locale.getDefault()); // en_US
        locale = new Locale("fr");
        Locale.setDefault(locale); // change the default
        System.out.println(Locale.getDefault()); // fr

        //Localizing Number
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));//266,666

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));//266.666

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));//266 666

        Locale.setDefault(new Locale("ur", "PK"));
        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));//Rs 48.00

        //Parsing Number
        Locale.setDefault(new Locale("en", "US"));
        String s = "40.45";
        var en = NumberFormat.getInstance(Locale.US);
        System.out.println(en.parse(s)); // 40.45
        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s)); // 40

        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance();
        double value = (Double) cf.parse(income);
        System.out.println(value); // 92807.99

        //Custom Number Formatter
        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d)); // 1,234,567.5

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d)); // 001,234,567.46700

        NumberFormat f3 = new DecimalFormat("$#,###,###.##");
        System.out.println(f3.format(d)); // $1,234,567.47        
    }
}