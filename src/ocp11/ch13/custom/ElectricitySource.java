package ocp11.ch13.custom;

public @interface ElectricitySource {

    public int voltage();
    int MIN_VOLTAGE = 2;
    public static final int MAX_VOLTAGE = 18;
}
