package ocp11.ch13.common;

import java.util.ArrayList;

public class Nightingale1 {

    @SuppressWarnings("deprecation")
    public void wakeUp() {
        SongBird.sing(10);
    }

    @SuppressWarnings("unchecked")
    public void goToBed() {
        SongBird.chirp(new ArrayList());
    }

    public static void main(String[] args) {
        var birdy = new Nightingale1();
        birdy.wakeUp();
        birdy.goToBed();
    }
}
