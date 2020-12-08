package ocp11.ch15.functionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class MySupplier {

    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(d1);
        System.out.println(d2);

        Supplier<StringBuilder> sb1 = StringBuilder::new;
        Supplier<StringBuilder> sb2 = () -> new StringBuilder();
        System.out.println(sb1.get());
        System.out.println(sb2.get());

        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1);
        System.out.println(s1);
    }
}