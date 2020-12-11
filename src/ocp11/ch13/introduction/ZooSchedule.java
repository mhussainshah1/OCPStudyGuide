package ocp11.ch13.introduction;

public @interface ZooSchedule {
    String[] hours();
}

class Lions {

    @ZooSchedule(hours = {"9am", "5pm", "10pm"})
    void feedLions() {
        System.out.print("Time to feed the lions!");
    }
}

class Peacocks {

    @ZooSchedule(hours = {"4am", "5pm"})
    void cleanPeacocksPen() {
        System.out.print("Time to sweep up!");
    }
}
