package ocp11.ch05;

public class StringMethods {

    public static void main(String[] args) {
        /**
         * a n i m a l s
         * 0 1 2 3 4 5 6
         */
        //length()
        String string = "animals";
        System.out.println(string.length()); // 7

        //charAt(
        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s
        //System.out.println(string.charAt(7)); // throws exception

        //indexOf()
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1

        //substring()
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 3)); // m
        System.out.println(string.substring(3, 7)); // mals

        System.out.println(string.substring(3, 3)); // empty string
        //System.out.println(string.substring(3, 2)); // throws exception
        //System.out.println(string.substring(3, 8)); // throws exception

        //toLowerCase() and toUpperCase()
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        //equals() and equalsIgnoreCase()
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        //startsWith() and endsWith()
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        //contains()
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        //replace()
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        //trim()
        System.out.println("abc".trim()); // abc
        System.out.println("\t a b c\n".trim()); // a b c
        String text = " abc\t ";
        System.out.println(text.trim().length()); // 3
        
        //strip()
        System.out.println("abc".strip()); // abc
        System.out.println("\t a b c\n".strip()); // a b c     
        System.out.println(text.strip().length()); // 3
        
        //stripLeading()
        System.out.println(text.stripLeading().length()); // 5
        
        //stripTrailing()
        System.out.println(text.stripTrailing().length());// 4
    }
}
