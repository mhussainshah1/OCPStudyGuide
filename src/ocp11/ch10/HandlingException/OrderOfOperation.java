package ocp11.ch10.HandlingException;

public class OrderOfOperation {

    public static void main(String... xyz) {
        try (MyFileClass a1 = new MyFileClass(1);
                MyFileClass a2 = new MyFileClass(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }
}
