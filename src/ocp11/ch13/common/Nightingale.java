package ocp11.ch13.common;

import java.util.ArrayList;
import java.util.List;

class SongBird {

    @Deprecated
    static void sing(int volume) {
    }

    static Object chirp(List<String> data) {
        return data.size();
    }
}

public class Nightingale {

    public void wakeUp() {
        SongBird.sing(10);
    }

    public void goToBed() {
        SongBird.chirp(new ArrayList());
    }

    public static void main(String[] args) {
        var birdy = new Nightingale();
        System.out.println("Hi");
        birdy.wakeUp();
        birdy.goToBed();
    }
}
