package ocp8.ch01.nestedClasses;

public class AnonInner3 {

    interface SaleTodayOnly {

        int dollarsOff();
    }

    public int pay() {
        return admission(5, new SaleTodayOnly() {
            public static final int CONSTANT = 1;

            @Override
            public int dollarsOff() {
                return 3;
            }
        }
        );
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
}
