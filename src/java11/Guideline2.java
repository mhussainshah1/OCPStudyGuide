package java11;

import java.util.HashSet;

public class Guideline2 {

    public static void main(String[] args) {
        var items = new HashSet<Item>();
        items.add(new Item());
        for (var item : items) {
            System.out.println(item);
        }
    }
}