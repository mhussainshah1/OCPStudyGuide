package ocp11.ch10.HandlingException;

public class MyTry {
    String info;
    public static void main(String[] args) {
        MyTry t = new MyTry();

        t.explore("");
        System.out.println(t.goHome());
        System.out.println(t.goHome2());
        System.out.println(t.exceptionInFinally());
        t.exit();
    }

    void explore(String s) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("t");
        } catch (Exception e) {
            sb.append("c");
        } finally {
            sb.append("f");
        }
        sb.append("a");
        System.out.println(sb.toString());//tfa
    }

    int goHome() {
        try {
            // Optionally throw an exception here
            System.out.print("1");
            return -1;
        } catch (Exception e) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }
    }

    int goHome2() {
        try {
            throw new Exception();// Optionally throw an exception here
//            System.out.print("1");
//            return -1;
        } catch (Exception e) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }
    }

    String exceptionInFinally() {
        try {

        } finally {
            info.toString();
            System.out.print("Exiting");
            return "zoo";
        }
    }

    void exit() {
        try {
            System.exit(0);
        } finally {
            System.out.print("Never going to get here"); // Not printed
        }
    }
}
