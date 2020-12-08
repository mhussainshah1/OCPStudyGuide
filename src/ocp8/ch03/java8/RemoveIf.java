package ocp8.ch03.java8;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

    public static void main(String[] args) {
        //removeIf()
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]
    }
}
