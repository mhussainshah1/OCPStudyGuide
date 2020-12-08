package ocp11.ch12.review;

public class Bear {

    enum FOOD {
        BERRIES, INSECTS {
            @Override
            public boolean isHealthy() {
                return true;
            }
        },
        FISH, ROOTS, COOKIES, HONEY;

        public abstract boolean isHealthy();
    }

    public static void main(String[] args) {
        System.out.print(FOOD.INSECTS);
        System.out.print(FOOD.INSECTS.ordinal());
        System.out.print(FOOD.INSECTS.isHealthy());
        System.out.print(FOOD.COOKIES.isHealthy());
    }
}
