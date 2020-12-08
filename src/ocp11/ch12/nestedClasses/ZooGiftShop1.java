package ocp11.ch12.nestedClasses;

public class ZooGiftShop1 {

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
