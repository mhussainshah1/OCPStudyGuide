package ocp11.ch04;

public class SwitchStatement {

    public static void day(int dayOfWeek) {
        System.out.println("");
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

//    private int getSortOrder(String firstName, final String lastName) {
//        String middleName = "Patricia";
//        final String suffix = "JR";
//        int id = 0;
//        switch (firstName) {
//            case "Test":
//                return 52;
//            case middleName: // DOES NOT COMPILE
//                id = 5;
//                break;
//            case suffix:
//                id = 0;
//                break;
//            case lastName: // DOES NOT COMPILE
//                id = 8;
//                break;
//            case 5: // DOES NOT COMPILE
//                id = 7;
//                break;
//            case 'J': // DOES NOT COMPILE
//                id = 10;
//                break;
//            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
//                id = 15;
//                break;
//        }
//        return id;
//    }
//
    public static void main(String[] args) {

        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        day(5);
        day(6);
        day(0);

    }
}
