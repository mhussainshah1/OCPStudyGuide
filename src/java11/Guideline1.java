package java11;

import java.util.List;

public class Guideline1 {

    public static void main(String[] args) {
         List<String> result = List.of("hello", "how", "are", "you", "?");
         
         var stringsList = List.of("hello", "how", "are", "you", "?");
    }
}