package ocp11.ch04;

public class Unreachable {

    public static void main(String[] args) {
        //break
        int checkDate = 0;
        while (checkDate < 10) {
            checkDate++;
            if (checkDate > 100) {
                break;
                checkDate++; // DOES NOT COMPILE
            }
        }
        
        //continue
        int minute = 1;
        WATCH: while (minute > 2) {
            if (minute++ > 2) {
                continue WATCH;
                System.out.print(minute); // DOES NOT COMPILE
            }
        }
        
        //return
        int hour = 2;
        switch (hour) {
            case 1:
                return;
                hour++; // DOES NOT COMPILE
            case 2:
        }
    }
}
