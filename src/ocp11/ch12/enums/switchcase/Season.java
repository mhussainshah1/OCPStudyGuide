package ocp11.ch12.enums.switchcase;

public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }

        switch (summer) {
            case Season.FALL:  // DOES NOT COMPILE
                System.out.println("Rake some leaves!");
                break;
            case 0:            // DOES NOT COMPILE
                System.out.println("Get out the sled!");
                break;
        }
    }
}
