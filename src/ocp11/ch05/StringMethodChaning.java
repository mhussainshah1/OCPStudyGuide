package ocp11.ch05;

public class StringMethodChaning {

    public static void main(String[] args) {
        String start = "AniMaL ";

        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); // "animal"
        String result = lowercase.replace('a', 'A'); // "Animal"
        System.out.println(result);

        String result1 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result1);

        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
