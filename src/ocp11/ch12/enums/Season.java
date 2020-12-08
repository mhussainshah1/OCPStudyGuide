package ocp11.ch12.enums;

public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String args[]) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER); // SUMMER
        System.out.println(s == Season.SUMMER); // true

        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        if (Season.SUMMER == 2) {
        } // DOES NOT COMPILE: can't compare enum and int directly
        //create an enum from a String
        Season s1 = Season.valueOf("SUMMER"); // SUMMER
//        Season s2 = Season.valueOf("summer"); 
//Exception in thread "main" java.lang.IllegalArgumentException: No enum constant enums.Season.summer
    }
}

enum ExtendedSeason extends Season { // DOES NOT COMPILE: can’t extend an enum

}