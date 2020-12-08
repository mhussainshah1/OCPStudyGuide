package ocp8.ch01.nestedClasses;

public class AnonInner1 {

    //Member Inner Class
    abstract class SaleTodayOnly {

        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        //Anonomous Inner Class
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
