package ocp11.ch10.commonType;

public class TryClassCastException {

    public static void main(String[] args) {
        String type = "moose";
//        Integer number = (Integer) type; // DOES NOT COMPILE

        type = "moose";
        Object obj = type;
        Integer number = (Integer) obj;
    }
}