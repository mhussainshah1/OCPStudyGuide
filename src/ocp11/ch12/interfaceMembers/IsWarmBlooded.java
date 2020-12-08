package ocp11.ch12.interfaceMembers;

public interface IsWarmBlooded {

    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }
}
