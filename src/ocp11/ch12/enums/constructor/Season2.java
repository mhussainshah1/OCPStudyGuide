package ocp11.ch12.enums.constructor;

public enum Season2 {
    WINTER {
        @Override
        public void getHours() {
            System.out.println("10am-3pm");
        }
    }, SPRING {
        @Override
        public void getHours() {
            System.out.println("9am-5pm");
        }
    }, SUMMER {
        @Override
        public void getHours() {
            System.out.println("9am-7pm");
        }
    }, FALL {
        @Override
        public void getHours() {
            System.out.println("9am-5pm");
        }
    };

    public abstract void getHours();

    public static void main(String[] args) {
        WINTER.getHours();
    }
}
