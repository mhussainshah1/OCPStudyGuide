package ocp8.ch01.enums.constructor;

public enum Season2 {
    WINTER {
        @Override
        public void printHours() {
            System.out.println("9am-3pm");
        }
    }, SPRING {
        @Override
        public void printHours() {
            System.out.println("9am-5pm");
        }
    }, SUMMER {
        @Override
        public void printHours() {
            System.out.println("9am-7pm");
        }
    }, FALL {
        @Override
        public void printHours() {
            System.out.println("9am-5pm");
        }
    };

    public abstract void printHours();

    public static void main(String[] args) {
        WINTER.printHours();
    }
}
