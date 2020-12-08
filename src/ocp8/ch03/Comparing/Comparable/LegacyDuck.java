package ocp8.ch03.Comparing.Comparable;

public class LegacyDuck implements Comparable {

    private String name;

    @Override
    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj; // cast because no generics
        return name.compareTo(d.name);
    }
} 