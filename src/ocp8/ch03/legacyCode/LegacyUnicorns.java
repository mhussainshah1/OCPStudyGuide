package ocp8.ch03.legacyCode;

import java.util.ArrayList;
import java.util.List;

public class LegacyUnicorns {

    public static void main(String[] args) {
        List<Unicorn> unicorns = new ArrayList<>();
        addUnicorn(unicorns);
        Unicorn unicorn = unicorns.get(0); // ClassCastException
    }

    private static void addUnicorn(List unicorn) {
        unicorn.add(new Dragon());
    }
}
