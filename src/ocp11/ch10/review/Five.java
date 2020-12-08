package ocp11.ch10.review;
public class Five {
    public static void main(String[] other) {
        Object obj = Integer.valueOf(3);
        String str = (String) obj;
        obj = null;
        System.out.println(obj.equals(null));
    }
}
