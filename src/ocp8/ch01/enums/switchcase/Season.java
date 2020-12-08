package ocp8.ch01.enums.switchcase;

public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        switch (summer) {
            case 0: // DOES NOT COMPILE: enum is not an int
                System.out.println("Get out the sled!");
                break;
            case Season.WINTER:// DOES NOT COMPILE: enum types are implied
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
}
