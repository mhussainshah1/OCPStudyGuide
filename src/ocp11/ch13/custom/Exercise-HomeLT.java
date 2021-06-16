package ocp11.ch13.custom;

public @interface Exercise {
    int hoursPerDay();
    int startHour() default 6;
}

@Exercise(startHour=5, hoursPerDay=3) 
class Cheetah {}

@Exercise(hoursPerDay=0) 
class Sloth {}

@Exercise(hoursPerDay=7, startHour="8") // DOES NOT COMPILE
class ZooEmployee {}