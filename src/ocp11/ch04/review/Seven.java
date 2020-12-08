package ocp11.ch04.review;

import java.time.DayOfWeek;

public class Seven {

    public static void main(String[] args) {

    }

    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0;
        switch (otherDay) {
            default:
            case 1:
                continue;
            case thursday:
                return DayOfWeek.THURSDAY;
            case 2:
                break;
            case Sunday:
                return DayOfWeek.SUNDAY;
            case DayOfWeek.MONDAY:
                return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
}
