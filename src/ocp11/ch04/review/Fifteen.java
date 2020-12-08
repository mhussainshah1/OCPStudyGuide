package ocp11.ch04.review;

public class Fifteen {

    public static void main(String[] args) {
        int height = 1;
        L1: while (height++ < 10) {
            long humidity = 12;
            L2: do {
                if (humidity-- % 12 == 0) {
                    continue L2;
                }
                int temperature = 30;
                L3: for (;;) {
                    temperature++;
                    if (temperature > 50) {
                        continue L2;
                    }
                }
            } while (humidity > 4);
        }
    }
}