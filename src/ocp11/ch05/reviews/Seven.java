package ocp11.ch05.reviews;

public class Seven {

    public static void main(String[] args) {
        var string = "12345";
        var builder = new StringBuilder("12345");
        
        builder.charAt(4); //5
        builder.replace(2, 4, "6").charAt(3);//5
        string.replace("123", "1").charAt(2);//5
    }
}
