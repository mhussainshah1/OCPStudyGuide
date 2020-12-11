package ocp11.ch13.specific;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface Technical {
}

class NetworkRepair {

    class OutSrc extends @Technical NetworkRepair {
    }

    public void repair() {
        var repairSubclass = new @Technical NetworkRepair() {
        };
        var o = new @Technical NetworkRepair().new @Technical OutSrc();
        int remaining = (@Technical int) 10.0;
    }
}