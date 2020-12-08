package ocp11.exam_1Z0_816;

public class Main {

    public static int reduce(int x) {
        int y = 4;
        class Computer {

            int reduce(int x) {
                return x - y--;
            }
        }
        Computer a = new Computer();
        return a.reduce(x);
    }

    public static void main(String[] args) {
        System.out.print(reduce(l));
    }
}
