package ocp8.ch01.enums.constructor;

public enum Season3 {
    WINTER {
        @Override
        public void printHours() {
            System.out.println("short hours");
        }
    }, SUMMER {
        @Override
        public void printHours() {
            System.out.println("long hours");
        }
    }, SPRING, FALL;

    public void printHours() {
        System.out.println("default hours");
    }

    public static void main(String[] args) {
        WINTER.printHours();
        FALL.printHours();
    }
}
